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
    api(project(":module06:module185:module8"))
    api(project(":module06:module207"))
    api(project(":module06:module267:module1"))
    api(project(":module07:module21:module02:module2:module5"))
    api(project(":module07:module21:module04:module5"))
    api(project(":module07:module21:module10:module5"))
    api(project(":module07:module20:module01:module6:module5"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module07:module21:module02:module2:module5"))
    implementation(project(":module07:module21:module04:module5"))
    implementation(project(":module07:module21:module10:module5"))
    implementation(project(":module07:module20:module01:module6:module5"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module07.module20.module01.module6.module2"
}
