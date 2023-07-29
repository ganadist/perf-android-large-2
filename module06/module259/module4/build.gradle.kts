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
    api(project(":module06:module295:module6"))
    api(project(":module06:module341:module2"))
    api(project(":module15:module36:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module341:module2"))
    implementation(project(":module15:module36:module1"))
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module259.module4"
}
