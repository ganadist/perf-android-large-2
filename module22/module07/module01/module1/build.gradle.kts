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
    api(project(":module06:module127"))
    api(project(":module06:module270"))
    api(project(":module06:module357"))
    api(project(":module15:module07:module1"))
    api(project(":module15:module62:module1"))
    api(project(":module22:module07:module02:module5"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module127"))
    implementation(project(":module06:module270"))
    implementation(project(":module06:module357"))
    implementation(project(":module15:module07:module1"))
    implementation(project(":module15:module62:module1"))
    implementation(project(":module22:module07:module02:module5"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module01.module1"
}
