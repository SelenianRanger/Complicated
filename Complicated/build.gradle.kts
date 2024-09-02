plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.complicated"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.complicated"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}