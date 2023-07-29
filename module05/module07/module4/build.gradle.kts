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
    api(project(":module05:module13:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module35"))
    implementation(project(":module05:module03:module2"))
    implementation(project(":module05:module13:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module15:module36:module1"))
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module07.module4"
}
