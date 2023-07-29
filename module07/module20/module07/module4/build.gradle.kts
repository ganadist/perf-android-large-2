plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 21
                }
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }
                kotlinOptions {
    jvmTarget = "1.8"
}
            }
dependencies {
    api(project(":module06:module013:module6"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module236:module6"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module340:module3"))
    api(project(":module07:module21:module06:module5"))
    api(project(":module07:module21:module08:module5"))
    api(project(":module07:module20:module07:module6"))
    api(project(":module07:module20:module09:module3:module5"))
    api("com.squareup.workflow:workflow-rx2:0.23.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module07:module21:module06:module5"))
    implementation(project(":module07:module21:module08:module5"))
    implementation(project(":module07:module20:module07:module6"))
    implementation(project(":module07:module20:module09:module3:module5"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module20:module02:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module20.module07.module4"
}
