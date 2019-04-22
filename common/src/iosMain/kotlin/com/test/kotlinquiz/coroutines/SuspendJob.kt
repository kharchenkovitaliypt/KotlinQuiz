package com.test.kotlinquiz.coroutines

import com.test.kotlinquiz.thread.doJob
import com.test.kotlinquiz.thread.logThread
import com.test.kotlinquiz.thread.mainDispatcher
import com.test.kotlinquiz.thread.threadSleep
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

fun randomText(sid: String) {

    GlobalScope.launch(mainDispatcher) {
        val result = suspendJob {
            threadSleep(5000)
            sid.toList().shuffled()
                .joinToString(" ") {
                    it.toUpperCase().toString()
                }
        }
        logThread("randomText() result: $result")
    }
}

actual suspend inline fun <P, R> suspendJob(
    crossinline producer: () -> P,
    crossinline job: (P) -> R
): R = suspendCoroutine { continuation ->
    val param = producer.invoke()
    doJob(
        job = { job(param) },
        consume = continuation::resume,
        fail = continuation::resumeWithException
    )
}
