plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("convention.feature.compose")
}

android {
    namespace = "com.onevizion.entry.core.ui"
}

dependencies {
    api(libs.androidx.core.ktx)
    api(libs.bundles.compose)
    api(libs.bundles.activity)
    implementation(libs.cicerone)
    api(libs.androidx.fragment.ktx)
    api(libs.androidx.appcompat)
}