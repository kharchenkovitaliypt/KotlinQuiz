package com.test.kotlinquiz.utils

import kotlinx.coroutines.CoroutineDispatcher

expect val mainDispatcher: CoroutineDispatcher

expect val currentThread: Any

expect val isMainThread: Boolean

//fun checkIsMainThread() {
//    if (!isMainThread) {
//        throw IllegalStateException("Must be main thread but current is $currentThread")
//    }
//}
