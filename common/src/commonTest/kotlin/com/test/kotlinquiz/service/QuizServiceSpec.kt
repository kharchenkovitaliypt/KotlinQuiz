package com.test.kotlinquiz.service

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.expect

object QuizServiceSpec: Spek({

    val service by memoized {
        object : AssetService {
            override suspend fun fetch(name: String): String {
                TODO()
            }
        }
    }

    test("How this is working?") {
        expect(4) {
            3 + 1
        }
    }

    describe("getting resource by name") {
        xit("returns json file in text form") {
            TODO()
        }
    }
})
