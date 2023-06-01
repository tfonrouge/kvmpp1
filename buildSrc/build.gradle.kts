plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

val kotlinVersion: String by System.getProperties()
val android_library_gradle_plugin: String by System.getProperties()

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("com.android.library:com.android.library.gradle.plugin:$android_library_gradle_plugin")
}
