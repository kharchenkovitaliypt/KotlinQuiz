package com.test.kotlinquiz.thread

import platform.darwin.*
import kotlin.native.concurrent.DetachedObjectGraph
import kotlin.native.concurrent.attach
import kotlin.native.concurrent.freeze

val globalQueue: dispatch_queue_t get() {
    val priority = DISPATCH_QUEUE_PRIORITY_DEFAULT.toLong()
    return dispatch_get_global_queue(priority, 0)
}
val mainQueue: dispatch_queue_t get() = dispatch_get_main_queue()

inline fun <L, R> doJob(
    local: L,
    jobQueue: dispatch_queue_t = globalQueue,
    crossinline job: () -> R,
    crossinline consume: (L, R) -> Unit,
    crossinline fail: (L, Throwable) -> Unit
) {
    assertMainThread()
    val localRef = ThreadLocalRef.of(local)

    runOn(jobQueue) {
        try {
            val result = job()
            runOn(mainQueue) {
                consume(localRef.getAndRelease(), result)
            }
        } catch (error: Throwable) {
            error.freeze()
            runOn(mainQueue) {
                fail(localRef.getAndRelease(), error)
            }
        }
    }
}

inline fun runOn(
    queue: dispatch_queue_t,
    crossinline block: () -> Unit
) {
    // Clean up accidental references
    val blockGraph = DetachedObjectGraph {
        ({ block() })
    }
    dispatch_async(queue, {
        initRuntimeIfNeeded()
        blockGraph.attach().invoke()
    }.freeze())
}