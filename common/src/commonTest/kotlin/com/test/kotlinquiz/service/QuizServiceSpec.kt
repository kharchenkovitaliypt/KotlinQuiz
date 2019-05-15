package com.test.kotlinquiz.service

import org.spekframework.spek2.Spek
import kotlin.test.expect

object QuizServiceSpec: Spek({

    test("3 + 1 = 5") {
        expect(5) { 3 + 1 }
    }
})
