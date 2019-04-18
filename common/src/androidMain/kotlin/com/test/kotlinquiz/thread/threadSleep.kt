package com.test.kotlinquiz.thread

actual fun threadSleep(millis: Long) {
    Thread.sleep(millis)
}