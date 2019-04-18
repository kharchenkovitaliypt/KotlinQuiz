package com.test.kotlinquiz.thread

import com.test.kotlinquiz.coroutines.MainDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import platform.Foundation.NSThread
import platform.darwin.*
import kotlin.coroutines.Continuation
import kotlin.native.concurrent.DetachedObjectGraph
import kotlin.native.concurrent.attach
import kotlin.native.concurrent.freeze

actual val currentThread: Any get() = NSThread.currentThread
actual val currentThreadName: String
    get() = if (NSThread.currentThread.isMainThread) "main" else "worker"

actual val isMainThread: Boolean get() = NSThread.isMainThread

fun logThread(msg: String) {
    println("$msg, thread: $currentThreadName")
}

actual val mainDispatcher: CoroutineDispatcher = MainDispatcher()