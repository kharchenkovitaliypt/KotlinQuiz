package com.test.kotlinquiz.service

import com.test.kotlinquiz.DbQuestion
import com.test.kotlinquiz.DbQuestionQueries
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.Size
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.ID
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.thread.threadSleep
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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

//fun doSomething() {
//    GlobalScope.launch {
//        val uuid = generateUUID()
//
//        println("UUID: $uuid")
//    }
//}
//
//suspend fun generateUUID(): String {
//    return withContext(Dispatchers.Default) {
//        threadSleep(3_000)
//        "943440"
//    }
//}