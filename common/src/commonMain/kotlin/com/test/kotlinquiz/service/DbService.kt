package com.test.kotlinquiz.service

import com.soywiz.klock.DateTime
import com.squareup.sqldelight.ColumnAdapter
import com.test.kotlinquiz.*

expect fun createDb(): KotlinQuizDb

fun createDbReminderAdapter() = DbReminder.Adapter(
    notifyTimeAdapter = DateTimeColumnAdapter()
)

class DateTimeColumnAdapter : ColumnAdapter<DateTime, Long> {

    override fun decode(databaseValue: Long) = DateTime(databaseValue)

    override fun encode(value: DateTime): Long = value.unixMillisLong
}