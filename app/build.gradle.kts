plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.safeargs.kotlin)
}

android {
    namespace = "com.ezequielrodriguez.horoscapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ezequielrodriguez.horoscapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "com.ezequielrodriguez.horoscapp.CustomTestRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable=false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            resValue("string","arisname","HoroscApp")
            buildConfigField("String","BASE_URL","\"https://newastro.vercel.app/\"")
        }
        getByName("debug"){
            isDebuggable=true
            resValue("string","arisname","[DEBUG] HoroscApp")
            buildConfigField("String","BASE_URL","\"https://newastro-debug.vercel.app/\"")

        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding=true
        buildConfig=true
    }

}

dependencies {

    //NavComponent
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    ///DaggerHilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    //CameraX
    implementation (libs.androidx.camera.core)
    implementation (libs.androidx.camera.camera2)
    implementation (libs.androidx.camera.lifecycle)
    implementation (libs.androidx.camera.view)
    implementation (libs.androidx.camera.extensions)



    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    //UnitTesting
    testImplementation(libs.junit)
    testImplementation(libs.kotlintest.runner.junit5)
    testImplementation(libs.mockk)


    //UITesting
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)
    androidTestImplementation(libs.androidx.espresso.contrib)
    androidTestImplementation (libs.androidx.espresso.intents)
    androidTestImplementation (libs.hilt.android.testing)
    androidTestImplementation (libs.androidx.fragment.testing)
    kaptAndroidTest(libs.hilt.android.compiler)


}