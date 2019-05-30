package com.test.kotlinquiz.service.runner

import android.util.Log
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.Runner
import org.junit.runner.manipulation.Filter
import org.junit.runners.model.RunnerBuilder
import org.spekframework.spek2.Spek

/**
 * Custom RunnerBuilder hooked into the main Test Instrumentation Runner
 * provided by the Android Test Support Library, which allows to run
 * the JUnit Platform for instrumented tests. With this,
 * the default JUnit 4-based Runner for Android instrumented tests is,
 * in a way, tricked into detecting JUnit Jupiter tests as well.
 *
 * The RunnerBuilder is added to the instrumentation runner
 * through a custom "testInstrumentationRunnerArgument" in the build.gradle.kts.kts script:
 *
 * <pre>
 *   android {
 *     defaultConfig {
 *       testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
 *       testInstrumentationRunnerArgument "runnerBuilder", "com.test.kotlinquiz.service.runner.AndroidJUnit5Builder"
 *     }
 *   }
 * </pre>
 *
 * (Suppressing unused, since this is hooked into the
 * project configuration via a Test Instrumentation Runner Argument.)
 */
@Suppress("unused")
class AndroidJUnit5Builder : RunnerBuilder() {

    @Throws(Throwable::class)
    override fun runnerForClass(testClass: Class<*>): Runner? {
        try {
            if (isSpekClass(testClass)) {
                return CustomJUnitPlatform(testClass)
            }
            return null

        } catch (e: NoClassDefFoundError) {
            Log.e("AndroidJUnit5", "JUnitPlatform not found on runtime classpath")
            throw IllegalStateException(
                "junit-platform-runner not found on runtime classpath of instrumentation tests; " +
                        "please review your androidTest dependencies or raise an issue.", e)
        } catch (e: Throwable) {
            Log.e("AndroidJUnit5", "Error constructing runner", e)
            throw e
        }
    }
}

fun isSpekClass(clazz: Class<*>): Boolean =
    Spek::class.java.isAssignableFrom(clazz)

private class CustomJUnitPlatform(clazz: Class<*>) : JUnitPlatform(clazz) {

    override fun filter(filter: Filter) {
        /* Ignore */
    }
}
