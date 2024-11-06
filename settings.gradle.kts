plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "ksp-backticks"
include("lib-core")
include("lib-processor")
include("client")
