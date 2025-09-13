plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
    id("com.google.devtools.ksp")
    kotlin("plugin.serialization") version "2.2.10"
}

android {
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dessalines.thumbkey"
        minSdk = 24
        targetSdk = 35
        versionCode = 162
        versionName = "5.0.7"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        ksp { arg("room.schemaLocation", "$projectDir/schemas") }
    }

    // Necessary for izzyondroid releases
    dependenciesInfo {
        // Disables dependency metadata when building APKs.
        includeInApk = false
        // Disables dependency metadata when building Android App Bundles.
        includeInBundle = false
    }

    if (project.hasProperty("RELEASE_STORE_FILE")) {
        signingConfigs {
            create("release") {
                storeFile = file(project.property("RELEASE_STORE_FILE")!!)
                storePassword = project.property("RELEASE_STORE_PASSWORD") as String?
                keyAlias = project.property("RELEASE_KEY_ALIAS") as String?
                keyPassword = project.property("RELEASE_KEY_PASSWORD") as String?

                // Optional, specify signing versions used
                enableV1Signing = true
                enableV2Signing = true
            }
        }
    }
    buildTypes {
        release {
            if (project.hasProperty("RELEASE_STORE_FILE")) {
                signingConfig = signingConfigs.getByName("release")
            }

            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                // Includes the default ProGuard rules files that are packaged with
                // the Android Gradle plugin. To learn more, go to the section about
                // R8 configuration files.
                getDefaultProguardFile("proguard-android-optimize.txt"),

                // Includes a local, custom Proguard rules file
                "proguard-rules.pro"
            )
        }
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = " (DEBUG)"
        }
    }

    lint {
        disable += "MissingTranslation"
        disable += "KtxExtensionAvailable"
        disable += "UseKtx"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs = listOf("-Xjvm-default=all-compatibility", "-opt-in=kotlin.RequiresOptIn")
    }
    buildFeatures {
        compose = true
    }
    namespace = "com.dessalines.thumbkey"
}

dependencies {
    // Exporting / importing DB helper
    implementation("com.github.dessalines:room-db-export-import:0.1.0")

    // Compose BOM
    implementation(platform("androidx.compose:compose-bom:2025.08.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended:1.7.8")
    implementation("androidx.compose.material3:material3-window-size-class")
    implementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.runtime:runtime-livedata:1.9.1")

    // Activities
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation("androidx.activity:activity-ktx:1.10.1")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-runtime-compose")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.9.3")

    // Emoji Picker
    implementation("androidx.emoji2:emoji2-emojipicker:1.5.0")

    // Markdown
    implementation("com.github.jeziellago:compose-markdown:0.5.7")

    // Preferences
    implementation("me.zhanghai.compose.preference:library:1.1.1")

    // Input switcher
    implementation("com.louiscad.splitties:splitties-systemservices:3.0.0")
    implementation("com.louiscad.splitties:splitties-views:3.0.0")

    // Room
    // To use Kotlin annotation processing tool
    ksp("androidx.room:room-compiler:2.7.2")
    implementation("androidx.room:room-runtime:2.7.2")
    annotationProcessor("androidx.room:room-compiler:2.7.2")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.7.2")

    // App compat
    implementation("androidx.appcompat:appcompat:1.7.1")

    // YAML serialization
    implementation("com.charleskorn.kaml:kaml:0.94.0")

    // Kotlin Reflect
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.2.10")

    // Arrow-kt for mutating deeply nested data classes
    implementation("io.arrow-kt:arrow-optics:2.1.2")
    ksp("io.arrow-kt:arrow-optics-ksp-plugin:2.1.2")
}
