import org.gradle.api.JavaVersion

object Config {

    val javaVersion = JavaVersion.VERSION_11

    val freeCompilerArgs = listOf(
        "-opt-in=kotlin.contracts.ExperimentalContracts",
        "-opt-in=kotlin.RequiresOptIn",
        "-Xjvm-default=all",
    )

    val excludes = listOf(
        "META-INF/ASL2.0",
        "META-INF/DEPENDENCIES",
        "META-INF/INDEX.LIST",
        "META-INF/LICENSE",
        "META-INF/LICENSE.txt",
        "META-INF/NOTICE",
        "META-INF/NOTICE.txt",
        "META-INF/*.kotlin_module",
        "META-INF/license.txt",
        "META-INF/notice.txt",
        "META-INF/io.netty.versions.properties",
    )
}
