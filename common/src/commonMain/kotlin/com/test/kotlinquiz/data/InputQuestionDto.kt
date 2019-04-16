package com.test.kotlinquiz.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputQuestionDto(
    override val id: ID,
    @SerialName("question")
    override val text: String,
    override val points: Points,
    override val next: ID? = null,
    override val validator: String? = null
) : InputQuestion
