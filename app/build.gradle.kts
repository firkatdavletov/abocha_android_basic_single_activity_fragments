plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cupcake"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
    }

    buildFeatures {
        dataBinding = true
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    namespace = "com.example.cupcake"
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    val lifecycle_version = "2.8.4"
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.core:core-ktx:1.13.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")
    implementation ("com.google.android.material:material:1.12.0")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")

    // Choose one of the following:
    // Material Design 3
    implementation ("androidx.compose.material3:material3")
    // or Material Design 2
    implementation ("androidx.compose.material:material")
    // or skip Material Design and build directly on top of foundational components
    implementation ("androidx.compose.foundation:foundation")
    // or only import the main APIs for the underlying toolkit systems,
    // such as input and measurement/layout
    implementation ("androidx.compose.ui:ui")

    // Android Studio Preview support
    implementation ("androidx.compose.ui:ui-tooling-preview")
    debugImplementation ("androidx.compose.ui:ui-tooling")

    // UI Tests
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    // Optional - Included automatically by material, only add when you need
    // the icons but not the material library (e.g. when using Material3 or a
    // custom design system based on Foundation)
    implementation ("androidx.compose.material:material-icons-core")
    // Optional - Add full set of material icons
    implementation ("androidx.compose.material:material-icons-extended")
    // Optional - Add window size utils
    implementation ("androidx.compose.material3:material3-window-size-class")

    // Optional - Integration with activities
    implementation ("androidx.activity:activity-compose:1.9.1")
    // Optional - Integration with ViewModels
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.4")

    implementation ("androidx.navigation:navigation-compose:2.7.7")

    implementation ("com.google.dagger:dagger:2.51.1")
    kapt ("com.google.dagger:dagger-compiler:2.51.1")
}