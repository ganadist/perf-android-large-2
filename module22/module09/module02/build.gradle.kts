plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module06:module336:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module07:module68"))
    implementation(project(":module09:module5"))
    implementation(project(":module19:module3"))
    implementation(project(":module22:module09:module01"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module09.module02"
}
