plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("dagger.hilt.android.plugin")
    id("convention.common")
    kotlin("kapt")
}

android {
    namespace = "com.onevizion.entry.core.network"

    defaultConfig {

        buildFeatures {
            buildConfig = true
        }

        buildConfigField("String", "BACKEND_URL", "\" /\"")
    }
}

dependencies {
    api(libs.bundles.network)
    implementation(libs.kotlinx.coroutines.core)
    kapt(libs.hilt.compiler)
    implementation(libs.hilt.android)
}