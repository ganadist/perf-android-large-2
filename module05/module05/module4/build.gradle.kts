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
    api(project(":module05:module05:module6"))
    api(project(":module06:module067"))
    api(project(":module06:module195"))
    api(project(":module06:module336:module1"))
    api(project(":module06:module347"))
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module05:module3"))
    implementation(project(":module05:module05:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module07:module84"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module05.module4"
}
