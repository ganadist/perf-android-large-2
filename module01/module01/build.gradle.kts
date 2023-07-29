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
    api(project(":module06:module028"))
    api(project(":module06:module084"))
    api(project(":module15:module36:module1"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module06:module028"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module36:module1"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module01.module01"
}
