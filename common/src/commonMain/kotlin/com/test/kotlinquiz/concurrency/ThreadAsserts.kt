package com.test.kotlinquiz.concurrency

fun assertIsMainThread() {
    if (!isMainThread) {
        throw IllegalStateException("Must be on main thread but current is $currentThread")
    }
}