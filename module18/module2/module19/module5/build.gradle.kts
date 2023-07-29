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
    api(project(":module06:module067"))
    api(project(":module06:module077"))
    api(project(":module06:module353:module1"))
    api(project(":module15:module05:module2"))
    api(project(":module15:module21:module1"))
    api(project(":module18:module1:module15:module2"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module067"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module18:module1:module15:module2"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module19.module5"
}
