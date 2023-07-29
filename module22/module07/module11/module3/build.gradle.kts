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
    api(project(":module06:module357"))
    api(project(":module22:module01:module04:module3"))
    api(project(":module22:module07:module02:module5"))
    api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module357"))
    implementation(project(":module22:module01:module04:module3"))
    implementation(project(":module22:module07:module02:module5"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module11.module3"
}
