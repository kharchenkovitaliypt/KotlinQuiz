package com.test.kotlinquiz.service

import org.spekframework.spek2.Spek
import kotlin.test.expect

object CommonSpec: Spek({

    test("3 + 2 = 5") {
        expect(5) { 3 + 2 }
    }
})
