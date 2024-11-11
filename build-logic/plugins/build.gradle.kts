plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.gradle)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("common-plugin") {
            id = "convention.common"
            implementationClass = "com.onevizion.entry.buildlogic.plugins.CommonPlugin"
        }
        register("feature-compose-plugin") {
            id = "convention.feature.compose"
            implementationClass = "com.onevizion.entry.buildlogic.plugins.FeatureComposePlugin"
        }
        register("test-plugin") {
            id = "convention.testing"
            implementationClass = "com.onevizion.entry.buildlogic.plugins.TestingPlugin"
        }
    }
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}