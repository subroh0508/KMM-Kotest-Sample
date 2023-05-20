pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(
    ":shared:components",
    ":shared:data:model",
    // ":shared:data:infra",
    ":androidApp",
)

includeBuild("build-logic")
