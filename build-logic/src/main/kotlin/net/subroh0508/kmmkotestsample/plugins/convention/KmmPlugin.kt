package net.subroh0508.kmmkotestsample.plugins.convention

import org.gradle.api.Plugin
import org.gradle.api.Project

class KmmPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply("primitive.mpp")
            apply("primitive.mpp.ios")
        }
    }
}
