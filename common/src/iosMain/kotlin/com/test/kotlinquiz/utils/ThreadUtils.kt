package com.test.kotlinquiz.utils

import platform.Foundation.NSThread

actual val currentThread: Any get() = NSThread.currentThread