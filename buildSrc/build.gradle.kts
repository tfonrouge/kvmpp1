plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

val kotlinVersion: String by System.getProperties()
val serializationVersion: String by System.getProperties()
val kvisionVersion: String by System.getProperties()
val android_library_gradle_plugin: String by System.getProperties()

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("com.android.library:com.android.library.gradle.plugin:$android_library_gradle_plugin")
    implementation("io.kvision:io.kvision.gradle.plugin:$kvisionVersion")
    implementation("org.jetbrains.kotlin.plugin.serialization:org.jetbrains.kotlin.plugin.serialization.gradle.plugin:$kotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
}
