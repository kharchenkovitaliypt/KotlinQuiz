package com.test.kotlinquiz.utils

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import platform.Foundation.NSThread
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun generateText(sid: String) {
        logThread("generateText() begin")
    GlobalScope.launch(mainDispatcher) {
        val result = generateTextSuspend(sid)
        logThread("generateText() result: $result")
    }
    logThread("generateText() end")
}

internal suspend fun generateTextSuspend(sid: String): String = suspendCoroutine { cont ->
    logThread("begin")

    val contRef = threadLocalRefOf(cont)

    runWorkerQueue {
        NSThread.sleepForTimeInterval(10.0)
        val result = sid + 100

        runMainQueue {
            contRef.consume().resume(result)
        }
    }

    logThread("end")
}



private fun logThread(msg: String) {
    println("$msg, thread: $currentThreadName")
}
