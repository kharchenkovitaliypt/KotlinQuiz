package com.test.kotlinquiz.utils

import android.os.Looper
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val currentThread: Any get() = Thread.currentThread()
actual val isMainThread: Boolean get() = Looper.myLooper() == Looper.getMainLooper()

actual val mainDispatcher: CoroutineDispatcher get() = Dispatchers.Main