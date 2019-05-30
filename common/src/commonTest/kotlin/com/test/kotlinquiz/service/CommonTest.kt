package com.test.kotlinquiz.service

import com.test.kotlinquiz.service.runner.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class CommonTest {

    @Test fun testCalc() {
        assertEquals(2 + 2, 4)
    }

    @Test fun testFail() = runBlocking<Unit> {
        assertFails { throw Exception() }
    }
}
