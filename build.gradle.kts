// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin_version"]}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${extra["kotlin_version"]}")
        classpath("com.squareup.sqldelight:gradle-plugin:${extra["sqldelight_version"]}")
    }
}
allprojects {
    repositories {
        mavenLocal()
        google()
        jcenter()
        maven(url = "https://kotlin.bintray.com/kotlinx")
        maven(url = "https://dl.bintray.com/soywiz/soywiz")
        maven(url = "https://dl.bintray.com/touchlabpublic/kotlin")
        maven(url = "https://dl.bintray.com/florent37/maven")
        maven(url = "https://dl.bintray.com/spekframework/spek-dev")
    }
}
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}