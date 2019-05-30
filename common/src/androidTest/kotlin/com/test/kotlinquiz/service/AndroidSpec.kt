package com.test.kotlinquiz.service

import com.test.annotation.SpekEngine
import com.test.kotlinquiz.service.runner.cit
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

@SpekEngine
object AndroidSpec: Spek({

    describe("AndroidSpec") {
        cit("should test something in coroutine") {

        }

        it("should test something2") {

        }
    }
})