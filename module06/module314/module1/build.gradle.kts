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
    api(project(":module06:module314:module5"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module136"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module314:module5"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module15:module07:module1"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module314.module1"
}
