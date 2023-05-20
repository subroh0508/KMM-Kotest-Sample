plugins {
    alias(libs.plugins.android.library)
    id("convention.kmm")
}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        val commonMain by getting
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
