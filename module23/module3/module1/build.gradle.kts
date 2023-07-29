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
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.truth:truth:1.0")
    androidTestImplementation("junit:junit:4.13")
    androidTestImplementation(libs.kotlin.test.junit)
    api(libs.kotlin.stdlib)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module23.module3.module1"
}
