package com.test.kotlinquiz.service

import com.soywiz.klock.TimeSpan
import com.squareup.sqldelight.ColumnAdapter
import com.test.kotlinquiz.*

expect fun createDb(): KotlinQuizDb

fun createDbReminderAdapter() = DbReminder.Adapter(
    notifyTimeAdapter = DateTimeColumnAdapter()
)

class DateTimeColumnAdapter : ColumnAdapter<TimeSpan, Long> {

    override fun decode(databaseValue: Long) = TimeSpan(databaseValue.toDouble())

    override fun encode(value: TimeSpan): Long = value.millisecondsLong
}