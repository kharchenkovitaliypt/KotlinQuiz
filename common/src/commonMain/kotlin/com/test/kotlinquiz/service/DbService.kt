package com.test.kotlinquiz.service

import com.soywiz.klock.DateTime
import com.squareup.sqldelight.ColumnAdapter
import com.test.kotlinquiz.*
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.*

expect fun createDb(): KotlinQuizDb

data class QuestionImpl(
    override val id: ID,
    override val text: String
) : Question

data class ReminderImpl(
    override val id: ID,
    override val photo: Uri?,
    override val isDone: Boolean,
    override val title: String,
    override val notifyTime: DateTime
) : Reminder

class DbService {

    private val db: KotlinQuizDb = createDb()
    private val questionQueries: DbQuestionQueries get() = db.dbQuestionQueries
    private val reminderQueries: DbReminderQueries get() = db.dbReminderQueries

    suspend fun insertQuestion(question: Question) = suspendJob {
        questionQueries.insert(question.id, question.text, Size(4))
    }

    suspend fun getQuestions(): List<Question> = suspendJob {
        questionQueries.selectAll()
            .executeAsList()
            .map(::toQuestion)
    }

    suspend fun insertReminder(reminder: Reminder) = suspendJob {
        reminderQueries.insert(reminder.id, reminder.photo.toString(), reminder.isDone, reminder.title, reminder.notifyTime)
    }

    suspend fun getReminders(): List<Reminder> = suspendJob {
        reminderQueries.selectAll()
            .executeAsList()
            .map(::toReminder)
    }

    suspend fun deleteAll() = suspendJob {
        reminderQueries.clearAll()
    }
}

private fun toQuestion(item: DbQuestion) = QuestionImpl(item.id, item.text)

private fun toReminder(item: DbReminder) = ReminderImpl(item.id, item.photo, item.isDone, item.title, item.notifyTime)

fun createDbQuestionAdapter() = DbQuestion.Adapter(
    sizeAdapter = SizeColumnAdapter()
)

fun createDbReminderAdapter() = DbReminder.Adapter(
    notifyTimeAdapter = DateTimeColumnAdapter()
)

class SizeColumnAdapter : ColumnAdapter<Size, Long> {

    override fun decode(databaseValue: Long)= Size(databaseValue)

    override fun encode(value: Size): Long = value.value
}

class DateTimeColumnAdapter : ColumnAdapter<DateTime, Long> {

    override fun decode(databaseValue: Long) = DateTime(databaseValue)

    override fun encode(value: DateTime): Long = value.unixMillisLong
}