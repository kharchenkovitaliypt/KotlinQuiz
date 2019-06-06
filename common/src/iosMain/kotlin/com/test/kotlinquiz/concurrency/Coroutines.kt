package com.test.kotlinquiz.concurrency

import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker
import kotlin.native.concurrent.attach

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
}

suspend inline fun <reified T, reified R> suspendWork(
    noinline producer: () -> T,
    crossinline job: (T) -> R
): R = suspendCoroutine { continuation ->

    val worker = Worker.start()
    val future = worker.execute(
        TransferMode.SAFE,
        {
            val args = producer()
            ({ job(args) })
        },
        { job -> runCatching(job) }
    )
    future.consumeOnMain(
        onSuccess = continuation::resume,
        onFailure = continuation::resumeWithException
    )
}
