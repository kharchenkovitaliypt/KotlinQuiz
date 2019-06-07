package com.test.kotlinquiz.service

import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.concurrency.suspendJob
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.data.ReminderImpl
import com.test.kotlinquiz.data.Uri
import com.test.kotlinquiz.data.defaultReminders

class ReminderService(private val db: KotlinQuizDb) {

    suspend fun saveDoneTask(reminder: Reminder, image: Uri) = suspendJob {
        db.dbReminderQueries.insert(
            id = reminder.id,
            title = reminder.title,
            notifyTime = reminder.notifyTime,
            photo = image,
            isDone = true
        )
    }

    suspend fun clearAllTasks() = suspendJob {
        db.dbReminderQueries.clearAll()
    }

    suspend fun getDoneTasks(): List<Reminder> = suspendJob {
        val list = db.dbReminderQueries.selectAll(::ReminderImpl).executeAsList()
        if (list.isNotEmpty()) {
            return@suspendJob list
        }
        db.transaction {
            defaultReminders.forEach {
                db.dbReminderQueries.insert(it.id, it.photo, it.isDone, it.title, it.notifyTime)
            }
        }
        return@suspendJob defaultReminders
    }
}