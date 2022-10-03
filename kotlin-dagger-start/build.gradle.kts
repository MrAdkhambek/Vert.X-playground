@file:Suppress(
    "DSL_SCOPE_VIOLATION",
    "UnstableApiUsage"
)

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.vertX.kotlin)
    implementation(libs.vertX.kotlin.coroutines)
    implementation(libs.vertX.web)

    // Log
    implementation(libs.logging.log4j)


    kapt (libs.dagger.compiler)
    kaptTest (libs.dagger.compiler)
    implementation (libs.dagger.dagger)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.vertX.junit5)
}
