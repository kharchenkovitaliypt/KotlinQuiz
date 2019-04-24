package com.test.kotlinquiz.coroutines

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

@PublishedApi
internal val threadPool = Executors.newCachedThreadPool()

actual suspend inline fun <reified T, reified R> suspendJob(
    noinline producer: () -> T,
    crossinline job: (T) -> R
): R  = suspendCoroutine { continuation ->

    val param = producer.invoke()

    threadPool.execute {
        val handler = Handler(Looper.getMainLooper())
        try {
            val result = job(param)
            handler.post { continuation.resume(result) }
        } catch (error: Throwable) {
            handler.post { continuation.resumeWithException(error) }
        }
    }
}
