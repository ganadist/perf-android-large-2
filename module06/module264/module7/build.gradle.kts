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
    api(project(":module06:module262:module6"))
    api(project(":module06:module333:module5"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module194"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module230:module2"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module262:module6"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module337:module3"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module264.module7"
}
