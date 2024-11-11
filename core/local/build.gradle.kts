plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("dagger.hilt.android.plugin")
    id("convention.common")
    kotlin("kapt")
}

android {
    namespace = "com.onevizion.entry.core.local"
}

dependencies {
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)
    kapt(libs.hilt.compiler)
    implementation(libs.hilt.android)
}