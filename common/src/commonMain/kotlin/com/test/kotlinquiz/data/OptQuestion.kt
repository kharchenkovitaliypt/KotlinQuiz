package com.test.kotlinquiz.data

interface OptQuestion: Question {
    override val id: ID
    override val text: String
    val answers: List<OptAnswer>
}

interface OptAnswer: Answer {
    val id: ID
    val content: String
    override val points: Points
    override val next: ID?
}