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
    api(project(":module06:module141:module1:module13"))
    api(project(":module06:module336:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module141:module1:module04"))
    implementation(project(":module06:module141:module1:module13"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module336:module1"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module141.module1.module09"
}
