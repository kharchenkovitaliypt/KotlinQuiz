package com.test.kotlinquiz.data

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OptQuestionDto(
    override val id: ID,
    @SerialName("question")
    override val text: String,
    override val answers: List<OptAnswerDto>
) : OptQuestion

@Serializable
data class OptAnswerDto(
    override val id: ID,
    override val content: String,
    override val points: Points,
    @Optional
    override val next: ID? = null
): OptAnswer