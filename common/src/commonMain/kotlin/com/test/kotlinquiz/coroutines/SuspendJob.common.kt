package com.test.kotlinquiz.coroutines

expect suspend inline fun <P, R> suspendJob(
    crossinline producer: () -> P,
    crossinline job: (P) -> R
): R