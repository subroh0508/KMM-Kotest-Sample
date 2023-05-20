import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.bundles.plugins)
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
}

gradlePlugin {
    plugins {
        register("kotilnMpp") {
            id = "primitive.mpp"
            implementationClass = "net.subroh0508.kmmkotestsample.plugins.primitive.MppPlugin"
        }
        register("kotlinMppIos") {
            id = "primitive.mpp.ios"
            implementationClass = "net.subroh0508.kmmkotestsample.plugins.primitive.MppIosPlugin"
        }

        register("kmm") {
            id = "convention.kmm"
            implementationClass = "net.subroh0508.kmmkotestsample.plugins.convention.KmmPlugin"
        }
    }
}
