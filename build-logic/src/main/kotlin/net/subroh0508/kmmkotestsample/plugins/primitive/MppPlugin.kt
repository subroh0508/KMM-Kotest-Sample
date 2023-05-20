package net.subroh0508.kmmkotestsample.plugins.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MppPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply("org.jetbrains.kotlin.multiplatform")
        }
    }
}

fun Project.kotlin(action: KotlinMultiplatformExtension.() -> Unit) {
    extensions.configure(action)
}
