plugins {
    id("kvmpp1.kotlin-mpp-library-conventions")
}

group = "com.example.mppLib"
version = "1.0"

repositories {
    google()
}

val serializationVersion: String by System.getProperties()

kotlin {
    jvmToolchain(17)
    jvm {
        compilations.all {
            java {
                targetCompatibility = JavaVersion.VERSION_17
            }
            kotlinOptions {
                jvmTarget = "17"
                freeCompilerArgs = listOf("-Xjsr305=strict")
            }
        }
    }
    js(IR) {
        browser()
        binaries.library()
    }
    androidTarget("androidLib") {
        publishLibraryVariants("release", "debug")
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
            }
        }
        val jvmMain by getting
        val jsMain by getting
        val androidLibMain by getting
    }
}

android {
    namespace = "com.fonrouge.arelData.library"
    compileSdk = 33
    defaultConfig {
        minSdk = 23
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
