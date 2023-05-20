package net.subroh0508.kmmkotestsample.plugins.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project

class MppIosPlugin : Plugin<Project> {
    override fun apply(target: Project) = with (target) {
        kotlin {
            iosArm64()
            iosSimulatorArm64()
            iosX64()

            val iosMain = sourceSets.create("iosMain") {
                dependsOn(sourceSets.getByName("commonMain"))
            }

            sourceSets.getByName("iosX64Main") {
                dependsOn(iosMain)
            }
            sourceSets.getByName("iosArm64Main") {
                dependsOn(iosMain)
            }
            sourceSets.getByName("iosSimulatorArm64Main") {
                dependsOn(iosMain)
            }

            val iosTest = sourceSets.create("iosTest") {
                dependsOn(sourceSets.getByName("commonTest"))
            }

            sourceSets.getByName("iosX64Test") {
                dependsOn(iosTest)
            }
            sourceSets.getByName("iosArm64Test") {
                dependsOn(iosTest)
            }
            sourceSets.getByName("iosSimulatorArm64Test") {
                dependsOn(iosTest)
            }
        }
    }
}
