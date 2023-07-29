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
    api(project(":module06:module207"))
    api(project(":module06:module345"))
    api(project(":module06:module353:module1"))
    api(project(":module22:module01:module35"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module207"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module22:module01:module35"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module17.module2"
}
