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
    api(project(":module01:module06"))
    api(project(":module04:module20"))
    api(project(":module06:module047:module4"))
    api(project(":module06:module046:module5"))
    api(project(":module06:module048"))
    api(project(":module06:module051"))
    api(project(":module06:module127"))
    api(project(":module06:module155"))
    api(project(":module06:module192"))
    api(project(":module06:module201:module1"))
    api(project(":module06:module241:module3"))
    api(project(":module06:module289"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module01:module06"))
    implementation(project(":module04:module20"))
    implementation(project(":module06:module047:module4"))
    implementation(project(":module06:module046:module5"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module241:module3"))
    implementation(project(":module06:module289"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module047.module1"
}
