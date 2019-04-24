package com.test.kotlinquiz.thread

fun assertIsMainThread() {
    if (!isMainThread) {
        throw IllegalStateException("Must be on main thread but current is $currentThread")
    }
}