plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("convention.feature.compose")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.onevizion.entry.feature.item"
    compileSdk = 34

}

dependencies {
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(project(":core:ui"))
    implementation(project(":navigation"))
    implementation(project(":core:network"))
    implementation(project(":core:coroutines"))
}