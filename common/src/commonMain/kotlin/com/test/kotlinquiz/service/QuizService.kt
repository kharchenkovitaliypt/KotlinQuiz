package com.test.kotlinquiz.service

import co.touchlab.stately.freeze
import com.soywiz.klock.DateTime
import com.test.kotlinquiz.data.*
import com.test.kotlinquiz.utils.logd
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.content
import kotlin.random.Random

class QuizService(
    private val assetService: AssetService
) {
    private data class InnerAnswer(
        val question: Question,
        val value: Any
    )

    private val dbService = DbService()

    @UseExperimental(UnstableDefault::class)
    private val jsonParser = Json.nonstrict
    private var questions: Map<ID, Question>? = null

    private var answers = mutableListOf<InnerAnswer>()
    private var totalPoints: Points = 0

    suspend fun startQuiz(): Question {
//        val time = DateTime.now()
//        val dbQuestions = dbService.getQuestions()
//        val spent = (DateTime.now() - time).millisecondsLong
//        logd("|Db questions: " + dbQuestions.size + ", spent: $spent")

        if (answers.isNotEmpty()) {
            throw IllegalStateException("Quiz is already started")
        }
        return getAllQuestions().values.first()
    }

    suspend fun processAnswer(question: Question, answer: Any): AnswerResult {
//        dbService.insertQuestion(
//            QuestionImpl(
//                question.id + Random.nextInt(),
//                question.text
//            ).freeze()
//        )

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
            val json = assetService.fetch("quiz.json")

            questions = jsonParser.parseJson(json).jsonArray
                    .map { el -> toQuestion(el.jsonObject) }
                    .map { q ->  q.id to q }
                    .toMap()
        }
        return questions!!
    }

    private fun toQuestion(obj: JsonObject): Question {
        val type = obj["inputType"]!!.content
        val serializer = when(type) {
            "select" -> OptQuestionDto.serializer()
            "text" -> InputQuestionDto.serializer()
            else -> throw IllegalArgumentException()
        }
        return jsonParser.fromJson(serializer, obj)
    }
}