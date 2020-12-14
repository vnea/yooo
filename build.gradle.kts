plugins {
    kotlin("jvm") version "1.4.10"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "11"
    }
}

group = "com.vnea"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.4.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.0")
}
