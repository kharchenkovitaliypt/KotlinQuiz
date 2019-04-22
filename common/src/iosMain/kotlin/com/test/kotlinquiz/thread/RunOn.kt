package com.test.kotlinquiz.thread

import platform.darwin.*
import kotlin.native.concurrent.DetachedObjectGraph
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.attach
import kotlin.native.concurrent.freeze

val globalQueue: dispatch_queue_t get() {
    val priority = DISPATCH_QUEUE_PRIORITY_DEFAULT.toLong()
    return dispatch_get_global_queue(priority, 0)
}
val mainQueue: dispatch_queue_t get() = dispatch_get_main_queue()

inline fun <R> doJob(
    jobQueue: dispatch_queue_t = globalQueue,
    crossinline job: () -> R,
    noinline consume: (R) -> Unit,
    noinline fail: (Throwable) -> Unit
) {
    assertMainThread()
    val callbacksRef = DetachedObjectGraph(TransferMode.UNSAFE) {
        consume to fail
    }

    runOn(jobQueue) {
        try {
            val result = job()

            runOn(mainQueue) {
                val (consumeBlock, _) = callbacksRef.attach()
                consumeBlock(result)
            }
        } catch (error: Throwable) {
            error.freeze()
            runOn(mainQueue) {
                val (_, failBlock) = callbacksRef.attach()
                failBlock(error)
            }
        }
    }
}

inline fun runOn(queue: dispatch_queue_t, crossinline block: () -> Unit) {
    // Clean up accidental references
    val blockGraph = DetachedObjectGraph {
        { block() }
    }
    dispatch_async(queue, {
        initRuntimeIfNeeded()
        blockGraph.attach().invoke()
    }.freeze())
}