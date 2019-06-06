package com.test.kotlinquiz.concurrency

suspend inline fun <reified R> suspendJob(
    crossinline job: (Unit) -> R
): R = suspendJob({}, job)

expect suspend inline fun <reified T, reified R> suspendJob(
    noinline producer: () -> T,
    crossinline job: (T) -> R
): R
