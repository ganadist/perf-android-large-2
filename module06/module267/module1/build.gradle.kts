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
    api(project(":module06:module339:module1"))
    api("androidx.recyclerview:recyclerview:1.0.0")
    api("com.squareup.cycler:cycler:0.1.4")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module339:module1"))
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("com.squareup.cycler:cycler:0.1.4")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module267.module1"
}
