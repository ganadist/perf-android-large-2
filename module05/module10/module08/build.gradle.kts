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
    api(project(":module05:module01:module12:module4"))
    api(project(":module05:module01:module13:module3"))
    api(project(":module05:module10:module12"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module260"))
    api(project(":module06:module339:module1"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module01:module12:module4"))
    implementation(project(":module05:module01:module13:module3"))
    implementation(project(":module05:module10:module12"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module339:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module10.module08"
}
