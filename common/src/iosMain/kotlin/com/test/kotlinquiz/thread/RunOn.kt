package com.test.kotlinquiz.thread

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.staticCFunction
import platform.darwin.*
import kotlin.native.concurrent.*

private typealias DQueue = dispatch_queue_t

private typealias DAG<T> = DetachedObjectGraph<T>

val globalQueue: DQueue get() {
    val priority = DISPATCH_QUEUE_PRIORITY_DEFAULT.toLong()
    return dispatch_get_global_queue(priority, 0)
}
val mainQueue: DQueue get() = dispatch_get_main_queue()

inline fun <T> doJob(
    jobQueue: DQueue = globalQueue,
    crossinline job: () -> T,
    noinline consume: (Result<T>) -> Unit
) {
    assert(isMainThread)

    val onResult = { result: DAG<Result<T>> ->
        consume(result.attach())
    }
    val onResultCont = onResult.asContinuationOnMain()

    executeAsync(jobQueue) {
        val result = detach {
            runCatching(job)
        }
        onResultCont(result)
    }
}

fun <T> Future<T>.consumeOnMain(block: (Result<T>) -> Unit) {
    doJob(globalQueue, job = { result }, consume = block)
}

fun <T> ((T) -> Unit).asContinuationOnMain(): Continuation1<T> {
    return Continuation1(this, staticCFunction { pointer ->
        dispatch_sync_f(mainQueue, pointer, staticCFunction { pointerOnMain ->
            pointerOnMain!!.callContinuation1<T>()
        })
    })
}

inline fun executeAsync(queue: DQueue, crossinline block: () -> Unit) {
    dispatch_async_f(
        queue,
        detach { { block() } }.asCPointer(),
        staticCFunction { pointer ->
            initRuntimeIfNeeded()
            attach<() -> Unit>(pointer!!).invoke()
        }
    )
}

fun <T> detach(producer: () -> T)
        = DetachedObjectGraph { producer() }

inline fun <reified T> attach(pointer: COpaquePointer): T
        = DetachedObjectGraph<T>(pointer).attach()
