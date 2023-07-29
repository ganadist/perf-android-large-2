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
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutine}")
    implementation(project(":module06:module353:module2"))
    implementation(project(":module06:module353:module5"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutine}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module353:module2"))
    testImplementation(project(":module06:module353:module5"))
    testImplementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutine}")
}
