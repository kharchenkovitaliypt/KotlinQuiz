package com.test.kotlinquiz.coroutines

import com.test.kotlinquiz.thread.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.native.concurrent.attach

data class MyData(var value: Int)

fun randomTextSample(sid: String) {

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

    val param = detach(producer)
    doJob(
        job = { job(param.attach()) },
        onSuccess = continuation::resume,
        onFailure = continuation::resumeWithException
    )

//    val worker = Worker.start()
//    val future = worker.execute(
//        TransferMode.SAFE,
//        {
//            val args = producer()
//            ({ job(args) })
//        },
//        { job -> runCatching(job) }
//    )
//    future.consumeOnMain(
//        onSuccess = continuation::resume,
//        onFailure = continuation::resumeWithException
//    )
}
