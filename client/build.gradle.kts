plugins {
    id("com.google.devtools.ksp") version "2.0.21-1.0.26"
    kotlin("jvm")
}

dependencies {
    implementation(project(":lib-core"))
    ksp(project(":lib-processor"))
}
