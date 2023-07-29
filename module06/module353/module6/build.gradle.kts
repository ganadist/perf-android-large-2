plugins {
    id("java-library")
    id("java")
    id("org.jetbrains.kotlin.jvm")
    id("kotlin-kapt")
}

dependencies {
    api(project(":module06:module353:module2"))
    api(project(":module06:module353:module5"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api(libs.kotlinx.coroutines.core)
    implementation(project(":module06:module353:module2"))
    implementation(project(":module06:module353:module5"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.core)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module353:module2"))
    testImplementation(project(":module06:module353:module5"))
    testImplementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    testImplementation(libs.kotlin.stdlib)
    testImplementation(libs.kotlinx.coroutines.core)
}
