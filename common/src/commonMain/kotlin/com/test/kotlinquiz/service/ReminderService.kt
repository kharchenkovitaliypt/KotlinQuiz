package com.test.kotlinquiz.service

import com.test.kotlinquiz.DbReminder
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.data.Uri
import com.test.kotlinquiz.data.reminders

class ReminderService(private val db: KotlinQuizDb) {

    private val dbService = DbService()

    suspend fun saveDoneTask(reminder: Reminder, image: Uri) {
        dbService.insertReminder(ReminderImpl(
            id = reminder.id,
            photo = image,
            notifyTime = reminder.notifyTime,
            isDone = true,
            title = reminder.title
        ))
    }

    suspend fun clearAllTasks() = suspendJob {
        db.dbReminderQueries.clearAll()
    }

    suspend fun getDoneTasks(): List<Reminder> {
        val list = db.dbReminderQueries.selectAll().executeAsList()
        if (list.isEmpty()) {
            db.transaction {
                reminders.forEach {
                    db.dbReminderQueries.insert(it.id, it.photo, it.isDone, it.title, it.notifyTime)
                }
            }
            return reminders
        }

        return list.map(::toReminder)
    }
}

private fun toReminder(item: DbReminder) = ReminderImpl(item.id, item.photo, item.isDone, item.title, item.notifyTime)