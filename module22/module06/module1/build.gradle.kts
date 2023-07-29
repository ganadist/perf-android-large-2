plugins{
  id("com.android.application")
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
    androidTestImplementation(project(":module05:module10:module10"))
    androidTestImplementation(project(":module06:module047:module2"))
    androidTestImplementation(project(":module07:module76"))
    androidTestImplementation(project(":module07:module84"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation(project(":module22:module01:module19"))
    androidTestImplementation(project(":module22:module01:module27"))
    androidTestImplementation(project(":module22:module01:module37"))
    androidTestImplementation(project(":module22:module06:module3"))
    androidTestImplementation(project(":module22:module04:module12"))
    androidTestImplementation(project(":module22:module04:module14"))
    androidTestImplementation(project(":module22:module04:module15:module3"))
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module06:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module06.module1"
}
