//package com.test.kotlinquiz.service
//
//import com.soywiz.klock.DateTime
//import com.squareup.sqldelight.ColumnAdapter
//import com.test.kotlinquiz.*
//import com.test.kotlinquiz.data.Uri
//import com.test.kotlinquiz.data.parseUri
//
//expect fun createDb(): KotlinQuizDb
//
//fun createDbReminderAdapter() = DbReminder.Adapter(
//    notifyTimeAdapter = DateTimeColumnAdapter,
//    photoAdapter = UriColumnAdapter
//)
//
//object UriColumnAdapter : ColumnAdapter<Uri, String> {
//
//    override fun decode(databaseValue: String) = parseUri(databaseValue)
//
//    override fun encode(value: Uri): String = value.toString()
//}
//
//object DateTimeColumnAdapter : ColumnAdapter<DateTime, Long> {
//
//    override fun decode(databaseValue: Long) = DateTime(databaseValue)
//
//    override fun encode(value: DateTime): Long = value.unixMillisLong
//}