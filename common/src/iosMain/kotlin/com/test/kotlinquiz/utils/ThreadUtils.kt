package com.test.kotlinquiz.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.Foundation.NSThread
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import kotlin.coroutines.CoroutineContext

actual val currentThread: Any get() = NSThread.currentThread
actual val isMainThread: Boolean get() = NSThread.isMainThread

actual val mainDispatcher: CoroutineDispatcher = object : CoroutineDispatcher() {

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatch_get_main_queue()) {
            block.run()
        }
    }
}