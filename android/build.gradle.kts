plugins {
    id("com.android.application")
    kotlin("android") //version("1.3.31")
    kotlin("android.extensions") //version("1.3.31")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.test.kotlinquiz"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions {
        exclude("META-INF/LICENSE.md")
        exclude("META-INF/atomicfu.kotlin_module")
        exclude("META-INF/kotlinx-io.kotlin_module")
        exclude("META-INF/kotlinx-coroutines-core.kotlin_module")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))
    implementation(project(":common"))

    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.2")
    implementation("androidx.lifecycle:lifecycle-extensions:2.0.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.google.android.material:material:1.1.0-alpha06")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${extra["kotlinx_serialization_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${extra["kotlinx_coroutines_version"]}")

//    implementation group: "org.jetbrains.kotlin", name: "kotlin-reflect", version: "1.3.31"

    val navVersion = "+"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

//    implementation "io.reactivex.rxjava2:rxkotlin:2.3.0"
//    implementation "io.reactivex.rxjava2:rxjava:2.2.8"

    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.idapgroup:tnt:1.1.1")
    implementation("androidx.work:work-runtime-ktx:2.1.0-alpha03")

    testImplementation("junit:junit:4.12")

    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
