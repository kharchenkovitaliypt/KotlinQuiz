package com.test.kotlinquiz.data

interface InputQuestion: Question, Answer {
    override val id: ID
    override val text: String
    override val next: ID?
    override val points: Points
    val validator: String?
}
