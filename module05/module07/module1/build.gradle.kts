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
    api(project(":module01:module35"))
    api(project(":module05:module01:module14:module4"))
    api(project(":module05:module07:module4"))
    api(project(":module06:module086:module1"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module01:module35"))
    implementation(project(":module05:module01:module10:module5"))
    implementation(project(":module05:module01:module14:module4"))
    implementation(project(":module05:module03:module2"))
    implementation(project(":module05:module05:module6"))
    implementation(project(":module05:module07:module4"))
    implementation(project(":module05:module09:module3"))
    implementation(project(":module06:module025:module2"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module141:module1:module13"))
    implementation(project(":module06:module187:module5"))
    implementation(project(":module07:module14"))
    implementation(project(":module07:module19:module4"))
    implementation(project(":module07:module56:module6"))
    implementation(project(":module07:module82"))
    implementation(project(":module07:module83"))
    implementation(project(":module15:module36:module1"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module05.module07.module1"
}
