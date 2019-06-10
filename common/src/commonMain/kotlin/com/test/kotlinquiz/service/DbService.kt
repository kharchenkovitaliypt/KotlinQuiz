package com.test.kotlinquiz.service

import com.soywiz.klock.TimeSpan
import com.squareup.sqldelight.ColumnAdapter
import com.test.kotlinquiz.*
import com.test.kotlinquiz.data.Uri
import com.test.kotlinquiz.data.parseUri

expect fun createDb(): KotlinQuizDb

fun createDbReminderAdapter() = DbReminder.Adapter(
    notifyTimeAdapter = DateTimeColumnAdapter,
    photoAdapter = UriColumnAdapter
)

object UriColumnAdapter : ColumnAdapter<Uri, String> {

    override fun decode(databaseValue: String) = parseUri(databaseValue)

    override fun encode(value: Uri): String = value.toString()
}

object DateTimeColumnAdapter : ColumnAdapter<TimeSpan, Long> {

    override fun decode(databaseValue: Long) = TimeSpan(databaseValue.toDouble())

    override fun encode(value: TimeSpan): Long = value.millisecondsLong
}