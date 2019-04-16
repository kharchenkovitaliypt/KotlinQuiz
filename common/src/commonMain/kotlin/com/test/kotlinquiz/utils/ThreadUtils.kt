package com.test.kotlinquiz.utils

import kotlinx.coroutines.CoroutineDispatcher

expect val mainDispatcher: CoroutineDispatcher

expect val currentThread: Any
expect val currentThreadName: String

expect val isMainThread: Boolean

fun assertMainThread() {
    if (!isMainThread) {
        throw IllegalStateException("Must be on main thread but current is $currentThread")
    }
}
