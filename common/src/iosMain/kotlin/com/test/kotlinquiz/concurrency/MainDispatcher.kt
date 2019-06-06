package com.test.kotlinquiz.concurrency

import kotlinx.coroutines.*
import platform.darwin.*
import kotlin.coroutines.CoroutineContext

@UseExperimental(InternalCoroutinesApi::class)
class MainDispatcher: CoroutineDispatcher(), Delay {

    private val mainQueue = dispatch_get_main_queue()

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(mainQueue) {
            try {
                block.run()
            } catch (err: Throwable) {
                logError("UNCAUGHT", err.message ?: "", err)
                throw err
            }
        }
    }

    @ExperimentalCoroutinesApi
    override fun scheduleResumeAfterDelay(timeMillis: Long, continuation: CancellableContinuation<Unit>) {
        dispatch_after(dispatch_time(DISPATCH_TIME_NOW, timeMillis * 1_000_000), mainQueue) {
            try {
                with(continuation) {
                    resumeUndispatched(Unit)
                }
            } catch (err: Throwable) {
                logError("UNCAUGHT", err.message ?: "", err)
                throw err
            }
        }
    }

    override fun invokeOnTimeout(timeMillis: Long, block: Runnable): DisposableHandle {
        val handle = object : DisposableHandle {
            var disposed = false
                private set

            override fun dispose() {
                disposed = true
            }
        }
        dispatch_after(dispatch_time(DISPATCH_TIME_NOW, timeMillis * 1_000_000), mainQueue) {
            try {
                if (!handle.disposed) {
                    block.run()
                }
            } catch (err: Throwable) {
                logError("UNCAUGHT", err.message ?: "", err)
                throw err
            }
        }

        return handle
    }
}

private fun logError(tag: String, msg: String, error: Throwable) {
    print("$tag: $msg")
    error.printStackTrace()
}