//package com.test.kotlinquiz.service
//
//import co.touchlab.stately.freeze
//import com.squareup.sqldelight.drivers.ios.NativeSqliteDriver
//import com.test.kotlinquiz.DbQuestion
//import com.test.kotlinquiz.KotlinQuizDb
//
//actual fun createDb(): KotlinQuizDb {
//    val driver = NativeSqliteDriver(KotlinQuizDb.Schema, "quiz.db")
//    return KotlinQuizDb(driver, createDbQuestionAdapter(), createDbReminderAdapter()).freeze()
//}