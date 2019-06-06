package com.test.kotlinquiz

import com.test.kotlinquiz.concurrency.suspendJob
import com.test.kotlinquiz.concurrency.logThread
import com.test.kotlinquiz.concurrency.mainDispatcher
import com.test.kotlinquiz.concurrency.threadSleep
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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
