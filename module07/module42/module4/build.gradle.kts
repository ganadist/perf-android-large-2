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
    api(project(":module06:module167"))
    api(project(":module06:module207"))
    api(project(":module15:module36:module1"))
    api("androidx.annotation:annotation:1.1.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module167"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module15:module36:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module42.module4"
}
