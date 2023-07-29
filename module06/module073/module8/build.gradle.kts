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
    api(project(":module06:module073:module7"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module248:module3"))
    implementation(project(":module06:module255"))
    implementation("com.google.truth:truth:1.0")
    implementation(libs.kotlin.stdlib)
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module073.module8"
}
