package com.test.kotlinquiz.concurrency

import kotlinx.coroutines.CoroutineDispatcher
import platform.Foundation.NSThread

actual val currentThread: Any get() = NSThread.currentThread
actual val currentThreadName: String
    get() = if (NSThread.currentThread.isMainThread) "main" else "worker"

actual val isMainThread: Boolean get() = NSThread.isMainThread

fun logThread(msg: String) {
    println("$msg, thread: $currentThreadName")
}

actual val mainDispatcher: CoroutineDispatcher = MainDispatcher()