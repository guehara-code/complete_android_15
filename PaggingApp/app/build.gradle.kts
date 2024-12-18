

plugins {
    alias(libs.plugins.android.application)
    id("com.google.dagger.hilt.android")
}

apply(plugin = "com.android.application")
apply(plugin = "dagger.hilt.android.plugin")

android {
    namespace = "com.example.paggingapp"
    compileSdk = 34

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.paggingapp"
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
}




dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    implementation("com.squareup.retrofit2:adapter-rxjava3:2.11.0")

    implementation("androidx.paging:paging-runtime:3.3.2")
    implementation("androidx.paging:paging-rxjava3:3.3.2")


//    implementation("com.google.dagger:hilt-android:2.41")
//    annotationProcessor("com.google.dagger:hilt-compiler:2.41")
    implementation("com.google.dagger:hilt-android:2.51.1")
    annotationProcessor("com.google.dagger:hilt-compiler:2.51.1")

//    implementation("com.github.bumptech.glide:glide:4.13.0")
//    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")

    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")

    val lifecycle_version = "2.5.0-alpha04"
    val arch_version = "2.2.0"

    // ViewModel
    implementation(libs.lifecycle.viewmodel)
    // LiveData
//    implementation("androidx.lifecycle:lifecycle-livedata:$lifecycle_version")
    implementation(libs.lifecycle.extensions)
    implementation(libs.lifecycle.viewmodel.ktx)


}

