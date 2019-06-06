package com.test.kotlinquiz.concurrency

actual fun threadSleep(millis: Long) {
    Thread.sleep(millis)
}