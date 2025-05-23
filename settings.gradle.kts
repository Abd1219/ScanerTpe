pluginManagement {
    plugins {
        // ... otros plugins
        id("com.google.devtools.ksp") version "2.1.20-1.0.32"//this should be in the plugin section in the settings.gradle.kts file
    }
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "AppDePrueba"
include(":app")
 