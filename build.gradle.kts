// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "8.7.2" apply false
    id("com.android.library") version "8.7.2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
    id("org.jmailen.kotlinter") version "4.4.1" apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
}

subprojects {
    apply(plugin = "org.jmailen.kotlinter") // Version should be inherited from parent
}