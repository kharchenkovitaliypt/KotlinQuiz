package com.test.kotlinquiz.utils

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import platform.Foundation.NSThread
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random

fun generateText(sid: String) {
        logThread("generateText() begin")
    GlobalScope.launch(mainDispatcher) {
        val result = generateTextSuspend(sid)
        logThread("generateText() result: $result")
    }
    logThread("generateText() end")
}

internal suspend fun generateTextSuspend(sid: String): String = suspendCoroutine { continuation ->
    logThread("begin")

    runWorker(
        local = continuation,
        work = {
            NSThread.sleepForTimeInterval(10.0)
            sid + Random.nextInt()
        },
        consume = { cont, result ->
            cont.resume(result)
        }
    )

//    val contRef = ThreadLocalRef(cont)
//
//    runOnGlobalQueue {
//        NSThread.sleepForTimeInterval(10.0)
//        val result = sid + 100
//
//        runOnMainQueue {
//            contRef.consume().resume(result)
//        }
//    }

    logThread("end")
}


inline fun <L, R> runWorker(
    local: L,
    crossinline work: () -> R,
    crossinline consume: (L, R) -> Unit
) {
    assertMainThread()
    val localRef = ThreadLocalRef(local)

    runOnGlobalQueue {
        val result = work()

        runOnMainQueue {
            @Suppress("UNCHECKED_CAST")
            consume(localRef.get() as L, result)
        }
    }
}


private fun logThread(msg: String) {
    println("$msg, thread: $currentThreadName")
}
