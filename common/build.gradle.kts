import com.squareup.sqldelight.gradle.SqlDelightDatabase

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.squareup.sqldelight")
    id("kotlinx-serialization")
}

sqldelight {
    methodMissing("KotlinQuizDb", arrayOf(closureOf<SqlDelightDatabase> {
        packageName = "com.test.kotlinquiz"
    }))
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(17)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArgument("runnerBuilder", "com.test.kotlinquiz.service.runner.AndroidJUnit5Builder")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude("META-INF/LICENSE*")
        exclude("META-INF/spek-dsl.kotlin_module")
        exclude("META-INF/atomicfu.kotlin_module")
        exclude("META-INF/spek-runtime.kotlin_module")
        exclude("META-INF/kotlinx-coroutines-core.kotlin_module")
    }
    sourceSets.forEach {
        it.java.srcDir("src/${it.name}/kotlin")
    }
}

kotlin {
    targets {
        android()

        iosX64("ios") {
            binaries {
                framework("CommonCode")
            }
//            compilations.main {
//                extraOpts "-Xobjc-generics"
//                cinterops {
//                    myFramework {
//                        includeDirs "/Users/test/Library/Caches/AppCode2019.1/DerivedData" +
//                                "/myFramework-bjvyjyjnjglmmpflmzavfrxptklz" +
//                                "/Build/Products/Debug-iphonesimulator/myFramework.framework"
//                        defFile = file("/Users/test/Projects/KotlinQuiz/common/src/iosMain/cinterop/myFramework.def")
//                    }
//                }
//            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${extra["kotlinx_coroutines_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-io:${extra["kotlinx_io_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${extra["kotlinx_serialization_version"]}")

                implementation("com.soywiz:klock-metadata:${extra["klock_version"]}")

//                implementation "io.ktor:ktor-client-core:$ktor_version"
//                implementation "io.ktor:ktor-client-json:$ktor_version"
            }
        }
        named("androidMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${extra["kotlinx_coroutines_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-io-jvm:${extra["kotlinx_io_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${extra["kotlinx_serialization_version"]}")

                implementation("androidx.lifecycle:lifecycle-extensions:2.0.0")
                implementation("com.soywiz:klock-android:${extra["klock_version"]}")
                implementation("com.squareup.sqldelight:android-driver:${extra["sqldelight_version"]}")

//                implementation "io.ktor:ktor-client-android:$ktor_version"
//                implementation "io.ktor:ktor-client-json-jvm:$ktor_version"
            }
        }
        named("iosMain") {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${extra["kotlinx_coroutines_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-io-native:${extra["kotlinx_io_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${extra["kotlinx_serialization_version"]}")

                implementation("com.soywiz:klock-iosx64:${extra["klock_version"]}")
                implementation("com.squareup.sqldelight:ios-driver:${extra["sqldelight_version"]}")

//                implementation "io.ktor:ktor-client-ios:$ktor_version"
//                implementation "io.ktor:ktor-client-ios-iosx64:$ktor_version"
//                implementation "io.ktor:ktor-client-json-native:$ktor_version"
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))

                implementation("org.spekframework.spek2:spek-dsl-metadata:${extra["spek_version"]}")
            }
        }
        named("androidTest") {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation(kotlin("reflect"))

                implementation("androidx.test:runner:1.2.0")
                implementation("androidx.test:core:1.2.0")

                implementation("org.spekframework.spek2:spek-dsl-jvm:${extra["spek_version"]}")
                implementation("org.spekframework.spek2:spek-runner-junit5:${extra["spek_version"]}") {
                    exclude(group = "io.github.classgraph", module = "classgraph")
                }

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${extra["kotlinx_coroutines_version"]}")
                implementation("androidx.lifecycle:lifecycle-extensions:2.0.0")

                implementation("org.junit.platform:junit-platform-launcher:1.4.2")
                implementation("org.junit.platform:junit-platform-runner:1.4.2")
                implementation("org.junit.vintage:junit-vintage-engine:5.4.2")

                implementation("io.cucumber:cucumber-android:4.3.0")
                implementation("io.cucumber:cucumber-picocontainer:4.3.0")
            }
        }
    }
}

kotlin.sourceSets.all {
    languageSettings.apply {
        // For kotlinx.serialization
        useExperimentalAnnotation("kotlin.Experimental")
        progressiveMode = true // false by default
    }
}

tasks.withType(Test::class) {
    useJUnitPlatform()
}

tasks.register<Sync>("packForXCode") {
    val frameworkDir = File(projectDir.parent, "ios/xcode-frameworks")
    val mode = project.findProperty("XCODE_CONFIGURATION")?.toString()?.toUpperCase() ?: "DEBUG"
    val framework = kotlin.iosX64("ios").binaries.getFramework("CommonCode", mode)

    inputs.property("mode", mode)
    dependsOn(framework.linkTask)

    from(framework.outputFile.parentFile)
    into(frameworkDir)

    doLast {
        File(frameworkDir, "gradlew").apply {
            writeText("""
            #!/bin/bash
            export "JAVA_HOME=${System.getProperty("java.home")}"
            cd "${rootProject.rootDir}"
            ./gradlew $@
            """.trimIndent())
            setExecutable(true)
        }
    }
}

tasks.build {
    dependsOn("packForXCode")
}
