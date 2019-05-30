package com.test.kotlinquiz.service.runner

import org.spekframework.spek2.dsl.Skip
import org.spekframework.spek2.dsl.TestBody
import org.spekframework.spek2.meta.*
import org.spekframework.spek2.style.specification.Suite

@Synonym(SynonymType.TEST)
@Descriptions(Description(DescriptionLocation.VALUE_PARAMETER, 0))
fun Suite.cit(
    description: String,
    skip: Skip = Skip.No,
    timeout: Long = delegate.defaultTimeout,
    body: suspend TestBody.() -> Unit
) {
    it(description, skip, timeout) {
        runBlocking {
            body()
        }
    }
}

@Synonym(SynonymType.TEST, excluded = true)
@Descriptions(Description(DescriptionLocation.VALUE_PARAMETER, 0))
fun Suite.xcit(
    description: String,
    reason: String = "",
    timeout: Long = delegate.defaultTimeout,
    body: TestBody.() -> Unit
) {
    xit(description, reason, timeout) {
        runBlocking {
            body()
        }
    }
}