@file:Suppress(
    "DSL_SCOPE_VIOLATION",
    "UnstableApiUsage"
)

import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}

allprojects {

    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    tasks.withType(KotlinCompile::class).all {
        kotlinOptions {
            jvmTarget = Config.javaVersion.toString()
            freeCompilerArgs = (freeCompilerArgs + Config.freeCompilerArgs).distinct()
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        testLogging {
            events = setOf(
                PASSED,
                SKIPPED,
                FAILED
            )
        }
    }
}
