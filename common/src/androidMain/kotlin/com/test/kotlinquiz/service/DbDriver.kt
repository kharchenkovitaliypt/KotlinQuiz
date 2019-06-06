package com.test.kotlinquiz.service

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.test.kotlinquiz.KotlinQuizDb

lateinit var appContext: Context

actual fun createDb(): KotlinQuizDb {
    val driver = AndroidSqliteDriver(KotlinQuizDb.Schema, appContext, "quiz.db")
    return KotlinQuizDb(driver, createDbQuestionAdapter(), createDbReminderAdapter())
}

