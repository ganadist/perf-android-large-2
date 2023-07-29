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
    api(project(":module02:module37:module18:module3"))
    api(project(":module06:module275:module3"))
    api(project(":module06:module295:module6"))
    api(project(":module15:module02:module1"))
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module37:module18:module3"))
    implementation(project(":module06:module275:module3"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module15:module02:module1"))
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module36.module5"
}
