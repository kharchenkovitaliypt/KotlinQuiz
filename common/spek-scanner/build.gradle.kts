plugins {
    kotlin("jvm") //version "1.3.31"
    kotlin("kapt") // version "1.3.31"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
    main {
        java.srcDir("${buildDir.absolutePath}/tmp/kapt/main/kotlinGenerated/")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    // configuration generator for service providers
    implementation("com.google.auto.service:auto-service:1.0-rc5")
    kapt("com.google.auto.service:auto-service:1.0-rc5")

    implementation(project(":common:spek-scanner:annotation"))
}
