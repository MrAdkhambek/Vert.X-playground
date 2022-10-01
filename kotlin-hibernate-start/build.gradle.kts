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
    implementation(libs.vertX.web)

    // Log
    implementation(libs.logging.log4j)

    // DB
    implementation(libs.vertX.pg)
    implementation(libs.hibernate.reactive)
    testImplementation(libs.bundles.testcontainers)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.vertX.junit5)
}
