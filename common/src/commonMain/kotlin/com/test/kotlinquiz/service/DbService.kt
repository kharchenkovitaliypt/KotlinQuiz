package com.test.kotlinquiz.service

import com.squareup.sqldelight.ColumnAdapter
import com.test.kotlinquiz.DbQuestion
import com.test.kotlinquiz.DbQuestionQueries
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.data.Size
import com.test.kotlinquiz.concurrency.suspendJob
import com.test.kotlinquiz.data.ID
import com.test.kotlinquiz.data.Question

expect fun createDb(): KotlinQuizDb

data class QuestionImpl(
    override val id: ID,
    override val text: String
) : Question

class DbService {

    private val db: KotlinQuizDb = createDb()
    private val questionQueries: DbQuestionQueries get() = db.dbQuestionQueries

    suspend fun insertQuestion(question: Question) = suspendJob {
        questionQueries.insert(question.id, question.text, Size(4))
    }

    suspend fun getQuestions(): List<Question> = suspendJob {
        questionQueries.selectAll()
            .executeAsList()
            .map(::toQuestion)
    }
}

private fun toQuestion(item: DbQuestion) = QuestionImpl(item.id, item.text)

fun createDbQuestionAdapter() = DbQuestion.Adapter(
    sizeAdapter = SizeColumnAdapter()
)

class SizeColumnAdapter : ColumnAdapter<Size, Long> {

    override fun decode(databaseValue: Long)= Size(databaseValue)

    override fun encode(value: Size): Long = value.value
}