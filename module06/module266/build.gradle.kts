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
    api(project(":module06:module342:module3"))
    api(project(":module16:module1"))
    api("com.google.code.gson:gson:2.8.5")
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module23:module1"))
    implementation(project(":module16:module1"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module266"
}
