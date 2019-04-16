package com.test.kotlinquiz.utils

import co.touchlab.stately.concurrency.ThreadLocalRef
import platform.Foundation.NSThread
import platform.darwin.DISPATCH_QUEUE_PRIORITY_HIGH
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_global_queue
import platform.darwin.dispatch_get_main_queue
import kotlin.native.concurrent.DetachedObjectGraph
import kotlin.native.concurrent.attach
import kotlin.native.concurrent.freeze

actual val currentThread: Any get() = NSThread.currentThread
actual val currentThreadName: String
    get() = if (NSThread.currentThread.isMainThread) "main" else "worker"

actual val isMainThread: Boolean get() = NSThread.isMainThread


inline fun runWorkerQueue(
    crossinline job: () -> Unit
) {
    val jobGraph = DetachedObjectGraph {
        { job() }
    }
    val queue = dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_HIGH, 0)
    dispatch_async(queue, {
        jobGraph.attach().invoke()
    }.freeze())
}

inline fun runMainQueue(
    crossinline job: () -> Unit
) {
    val jobGraph = DetachedObjectGraph {
        ({ job() })
    }
    dispatch_async(dispatch_get_main_queue(), {
        jobGraph.attach().invoke()
    }.freeze())
}

inline fun <reified T> ThreadLocalRef<T>.consume(): T {
    val current = get()
    remove()
    return if (null is T) current as T else current!!
}

fun <T> ThreadLocalRef<T>.getAndSet(value: T?): T? {
    val current = get()
    set(value)
    return current
}

fun <T> threadLocalRefOf(value: T): ThreadLocalRef<T> {
    return ThreadLocalRef<T>().apply {
        set(value)
        freeze()
    }
}