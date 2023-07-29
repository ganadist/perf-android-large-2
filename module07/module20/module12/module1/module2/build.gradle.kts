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
    api(project(":module07:module21:module11:module5"))
    api(project(":module07:module20:module05:module1:module5"))
    api(project(":module07:module20:module08:module5"))
    api(project(":module07:module20:module11:module1:module5"))
    api(project(":module07:module20:module12:module1:module5"))
    api(project(":module07:module20:module12:module2:module5"))
    api(project(":module07:module20:module12:module3:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module07:module21:module03:module1"))
    implementation(project(":module07:module21:module09:module1"))
    implementation(project(":module07:module21:module11:module5"))
    implementation(project(":module07:module20:module05:module1:module5"))
    implementation(project(":module07:module20:module08:module5"))
    implementation(project(":module07:module20:module11:module1:module5"))
    implementation(project(":module07:module20:module12:module1:module5"))
    implementation(project(":module07:module20:module12:module2:module5"))
    implementation(project(":module07:module20:module12:module3:module3"))
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module20:module02:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module20.module12.module1.module2"
}
