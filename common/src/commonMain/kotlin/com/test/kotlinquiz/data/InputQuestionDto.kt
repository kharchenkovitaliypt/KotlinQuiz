package com.test.kotlinquiz.data

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputQuestionDto(
    override val id: ID,
    @SerialName("question")
    override val text: String,
    override val points: Points,
    @Optional override val next: ID? = null,
    @Optional override val validator: String? = null
) : InputQuestion
