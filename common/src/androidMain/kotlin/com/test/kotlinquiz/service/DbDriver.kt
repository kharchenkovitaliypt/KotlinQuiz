package com.test.kotlinquiz.service

import android.content.Context
import com.squareup.sqldelight.ColumnAdapter
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.test.kotlinquiz.DbQuestion
import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.Size

lateinit var appContext: Context

actual fun createDb(): KotlinQuizDb {
    val driver = AndroidSqliteDriver(KotlinQuizDb.Schema, appContext, "quiz.db")
    return KotlinQuizDb(driver, createDbQuestionAdapter())
}

