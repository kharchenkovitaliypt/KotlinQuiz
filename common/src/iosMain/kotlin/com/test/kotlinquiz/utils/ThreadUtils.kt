package com.test.kotlinquiz.utils

import platform.Foundation.NSThread
import platform.darwin.DISPATCH_QUEUE_PRIORITY_HIGH
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_global_queue
import platform.darwin.dispatch_get_main_queue
import platform.darwin.dispatch_queue_t
import kotlin.native.concurrent.DetachedObjectGraph
import kotlin.native.concurrent.attach

actual val currentThread: Any get() = NSThread.currentThread
actual val currentThreadName: String
    get() = if (NSThread.currentThread.isMainThread) "main" else "worker"

actual val isMainThread: Boolean get() = NSThread.isMainThread


inline fun runOnGlobalQueue(
    crossinline block: () -> Unit
) {
    val queue = dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_HIGH, 0)
    runOnQueue(queue, block)
}

inline fun runOnMainQueue(
    crossinline block: () -> Unit
) {
    runOnQueue(dispatch_get_main_queue(), block)
}

inline fun runOnQueue(
    queue: dispatch_queue_t
    crossinline block: () -> Unit
) {
    val blockGraph = DetachedObjectGraph {
        ({ block() })
    }
    dispatch_async(queue) {
        initRuntimeIfNeeded()
        blockGraph.attach().invoke()
    }.freeze()
}


//inline fun <reified T> ThreadLocalRef<T>.consume(): T {
//    val current = get()
//    remove()
//    return if (null is T) current as T else current!!
//}

//fun <T> ThreadLocalRef<T>.getAndSet(value: T?): T? {
//    val current = get()
//    set(value)
//    return current
//}

//fun <T> threadLocalRefOf(value: T): ThreadLocalRef<T> {
//    return ThreadLocalRef<T>().apply {
//        set(value)
//        freeze()
//    }
//}