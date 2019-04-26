package com.test.kotlinquiz

import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.thread.logThread
import com.test.kotlinquiz.thread.mainDispatcher
import com.test.kotlinquiz.thread.threadSleep
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.random.Random

fun runTest(sid: String) {

    GlobalScope.launch(mainDispatcher) {

        val result = suspendJob({
            object {
                var value = sid
            }
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
