package com.test.kotlinquiz.thread

import kotlinx.coroutines.CoroutineDispatcher

expect val mainDispatcher: CoroutineDispatcher

expect val currentThread: Any
expect val currentThreadName: String

expect val isMainThread: Boolean
