plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("convention.common")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.onevizion.entry.navigation"

}

dependencies {
    api(libs.cicerone)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}