plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.thequizapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.thequizapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

//    val lifecycle_version = "2.8.7"
//
//    implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version")
//
//    implementation("androidx.lifecycle:lifecycle-livedata:$lifecycle_version")

//    implementation("com.squareup.retrofit2:retrofit:2.11.0")

//    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    implementation(libs.lifecycle.viewmodel)

    implementation(libs.lifecycle.livedata)

    implementation(libs.retrofit)

    implementation(libs.converter.gson)
}