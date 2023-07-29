plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module03:module09:module1:module2"))
    api(project(":module22:module08:module1:module2"))
    api(project(":module22:module08:module2:module2"))
    api(project(":module22:module08:module5"))
    api("com.google.dagger:dagger:2.28")
    implementation(project(":module03:module09:module1:module2"))
    implementation(project(":module22:module08:module1:module2"))
    implementation(project(":module22:module08:module2:module2"))
    implementation(project(":module22:module08:module5"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module08.module7"
}