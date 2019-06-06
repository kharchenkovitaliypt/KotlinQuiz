package com.test.kotlinquiz.concurrency

import android.os.Looper
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val currentThread: Any get() = Thread.currentThread()
actual val currentThreadName: String get() = Thread.currentThread().name

actual val isMainThread: Boolean get() = Looper.myLooper() == Looper.getMainLooper()

actual val mainDispatcher: CoroutineDispatcher get() = Dispatchers.Main
