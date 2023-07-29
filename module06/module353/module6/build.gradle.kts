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
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation(project(":module06:module353:module2"))
    implementation(project(":module06:module353:module5"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module353:module2"))
    testImplementation(project(":module06:module353:module5"))
    testImplementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
}