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
    api(project(":module07:module21:module02:module2:module5"))
    api(project(":module07:module21:module04:module5"))
    api(project(":module07:module21:module12:module5"))
    api(project(":module07:module20:module01:module3:module4"))
    api(project(":module07:module20:module01:module5:module4"))
    api(project(":module07:module20:module02:module1"))
    api(project(":module07:module20:module03:module5"))
    api(project(":module07:module20:module04:module3"))
    api(project(":module07:module20:module06:module5"))
    api(project(":module07:module20:module07:module6"))
    api(project(":module07:module20:module09:module2:module5"))
    api(project(":module07:module20:module12:module1:module5"))
    api(project(":module07:module31:module3"))
    api(project(":module07:module67:module4"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module35"))
    implementation(project(":module06:module207"))
    implementation(project(":module07:module21:module02:module2:module5"))
    implementation(project(":module07:module21:module04:module5"))
    implementation(project(":module07:module21:module09:module1"))
    implementation(project(":module07:module21:module12:module5"))
    implementation(project(":module07:module20:module01:module3:module4"))
    implementation(project(":module07:module20:module01:module5:module4"))
    implementation(project(":module07:module20:module02:module1"))
    implementation(project(":module07:module20:module03:module5"))
    implementation(project(":module07:module20:module04:module3"))
    implementation(project(":module07:module20:module06:module5"))
    implementation(project(":module07:module20:module07:module6"))
    implementation(project(":module07:module20:module09:module2:module5"))
    implementation(project(":module07:module20:module10:module5"))
    implementation(project(":module07:module20:module12:module1:module5"))
    implementation(project(":module07:module31:module3"))
    implementation(project(":module07:module67:module4"))
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module21:module12:module1"))
    testImplementation(project(":module07:module20:module02:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module20.module06.module2"
}
