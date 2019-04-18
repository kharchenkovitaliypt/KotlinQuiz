package com.test.kotlinquiz.service

import co.touchlab.stately.freeze
import com.test.kotlinquiz.DbQuestion
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.ID
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.thread.threadSleep
import kotlin.random.Random

expect fun createDb(): KotlinQuizDb

data class QuestionImpl(
    override val id: ID,
    override val text: String
) : Question

class DbService {

    private val db = createDb()

    suspend fun insertQuestion(question: Question) = suspendJob({ db }) { db ->
//        logd("insertQuestion() thread: $currentThreadName")
        threadSleep(Random.nextLong(1000, 4000))

        val queries = db.dbQuestionQueries
        queries.insert(question.id, question.text)
    }

    suspend fun getQuestions(): List<Question> = suspendJob({ db }) { db ->
//        logd("getQuestions() thread: $currentThreadName")
        threadSleep(3000)
        db.dbQuestionQueries.selectAll().executeAsList().map(::toQuestion).freeze()
    }
}

private fun toQuestion(item: DbQuestion) = QuestionImpl(item.id, item.text)