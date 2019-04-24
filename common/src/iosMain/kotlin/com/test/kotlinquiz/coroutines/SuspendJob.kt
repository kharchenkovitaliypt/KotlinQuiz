package com.test.kotlinquiz.coroutines

import com.test.kotlinquiz.thread.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker
import kotlin.native.concurrent.attach

data class MyData(var value: Int)

fun randomText(sid: String) {

    GlobalScope.launch(mainDispatcher) {

        val result = suspendJob({
            MyData(2)
        }) { data ->
            threadSleep(5000)
            data.apply {
                value += 30
                logThread("randomText() data hashCode: ${hashCode()}, value: $value")
            }
        }
        result.value += 400
        logThread("randomText() data hashCode: ${result.hashCode()}, value: ${result.value}")

        logThread("randomText() result: $result")
    }
}

actual suspend inline fun <reified T, reified R> suspendJob(
    noinline producer: () -> T,
    crossinline job: (T) -> R
): R = suspendCoroutine { continuation ->

    Worker.start(errorReporting = true).execute(
        TransferMode.SAFE,
        {
            ({ param: T -> job(param) }) to producer()
        },
        { (job, param) -> job(param) }
    ).consumeOnMain { result ->
        result.fold(
            onSuccess = continuation::resume,
            onFailure = continuation::resumeWithException
        )
    }

//    val param = detach(producer)
//    doJob(
//        job = { job(param.attach()) },
//        consume = { result ->
//            result.fold(
//                onSuccess = continuation::resume,
//                onFailure = continuation::resumeWithException
//            )
//        }
//    )
}
