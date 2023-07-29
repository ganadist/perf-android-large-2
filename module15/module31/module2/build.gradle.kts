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
    api(project(":module15:module31:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module245"))
    implementation(project(":module06:module255"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module15:module31:module1"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module15.module31.module2"
}
