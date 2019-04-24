package com.test.kotlinquiz.service

import com.test.kotlinquiz.DbQuestion
import com.test.kotlinquiz.DbQuestionQueries
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.ID
import com.test.kotlinquiz.data.Question

expect fun createDb(): KotlinQuizDb

data class QuestionImpl(
    override val id: ID,
    override val text: String
) : Question

class DbService {

    private val db: KotlinQuizDb = createDb()
    private val queries: DbQuestionQueries get() = db.dbQuestionQueries

    suspend fun insertQuestion(question: Question) = suspendJob {
        queries.insert(question.id, question.text)
    }

    suspend fun getQuestions(): List<Question> = suspendJob {
        queries.selectAll()
            .executeAsList()
            .map(::toQuestion)
    }
}

private fun toQuestion(item: DbQuestion) = QuestionImpl(item.id, item.text)