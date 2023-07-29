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
    api(project(":module05:module13:module1"))
    api(project(":module06:module276:module1"))
    api(project(":module06:module353:module2"))
    api(project(":module15:module21:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.inject:javax.inject:1")
    implementation(project(":module05:module13:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module03.module2"
}
