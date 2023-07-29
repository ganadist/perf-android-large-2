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
    api(project(":module02:module37:module29:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module37:module29:module1"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("junit:junit:4.13")
    implementation(libs.kotlin.stdlib)
    implementation("org.robolectric:robolectric:4.3")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module29.module2"
}
