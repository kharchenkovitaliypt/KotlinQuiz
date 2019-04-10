package com.test.kotlinquiz.service

import com.test.kotlinquiz.data.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.io.core.readText
import kotlinx.io.core.use
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.content

class QuizService(
    private val assetService: AssetService
) {
    private data class InnerAnswer(
        val question: Question,
        val value: Any
    )

    private val jsonParser = Json.nonstrict
    private var questions: Map<ID, Question>? = null

    private var answers = mutableListOf<InnerAnswer>()
    private var totalPoints: Points = 0

    suspend fun startQuiz(): Question {
        if (answers.isNotEmpty()) {
            throw IllegalStateException("Quiz is already started")
        }
        return getAllQuestions().values.first()
    }

    suspend fun processAnswer(question: Question, answer: Any): AnswerResult {
        answers.add(InnerAnswer(question, answer))

        val (nextQ, totalPoints) = when(question) {
            is OptQuestion -> processAnswerInner(answer as OptAnswer)
            is InputQuestion -> processAnswerInner(question)
            else -> throw IllegalArgumentException()
        }
        return AnswerResult(nextQ, totalPoints)
    }

    private suspend fun processAnswerInner(answer: Answer): Pair<Question?, Points> {
        totalPoints += answer.points
        return getAllQuestions()[answer.next] to totalPoints
    }

    private suspend fun getAllQuestions(): Map<ID, Question> {
        if (questions == null) {
            // withContext(Dispatchers.Default) { // TODO Implement Default for IOS
                val json = assetService.fetch("quiz.json")
            questions = jsonParser.parseJson(json).jsonArray
                    .map { el -> toQuestion(el.jsonObject) }
                    .map { q ->  q.id to q }
                    .toMap()
//            }
        }
        return questions!!
    }

    private fun toQuestion(obj: JsonObject): Question {
        val type = obj["inputType"].content
        val serializer = when(type) {
            "select" -> OptQuestionDto.serializer()
            "text" -> InputQuestionDto.serializer()
            else -> throw IllegalArgumentException()
        }
        return jsonParser.fromJson(serializer, obj)
    }
}