import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    alias(libs.plugins.android.library)
    id("convention.kmm")
}

val xcFrameworkName = "iosArtifacts"
val xcf = XCFramework(xcFrameworkName)

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = xcFrameworkName

            xcf.add(this)

            export(project(":shared:data:model"))
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":shared:data:model"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting
        val androidUnitTest by getting
    }
}

android {
    namespace = "com.example.kmmkotestsample"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
