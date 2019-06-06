package com.test.kotlinquiz.concurrency

import platform.Foundation.NSThread

actual fun threadSleep(millis: Long) {
    NSThread.sleepForTimeInterval(millis / 1000.0)
}