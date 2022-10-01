@file:Suppress(
    "DSL_SCOPE_VIOLATION",
    "UnstableApiUsage"
)

plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.vertX.kotlin)
    implementation(libs.vertX.kotlin.coroutines)
    implementation(libs.vertX.web)

    // Log
    implementation(libs.logging.log4j)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.vertX.junit5)
}
