package com.test.kotlinquiz.thread

fun assertMainThread() {
    if (!isMainThread) {
        throw IllegalStateException("Must be on main thread but current is $currentThread")
    }
}