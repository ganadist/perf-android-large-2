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
    api(project(":module06:module224:module6"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module15:module41:module1"))
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module59.module15.module1"
}
