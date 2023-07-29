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
    api(project(":module06:module038"))
    api(project(":module06:module050"))
    api(project(":module06:module336:module1"))
    api(project(":module08:module3"))
    api(project(":module22:module07:module06:module2"))
    api("androidx.test.espresso:espresso-contrib:3.1.0")
    api("androidx.test.espresso:espresso-core:3.1.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module038"))
    implementation(project(":module06:module050"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module08:module3"))
    implementation(project(":module22:module07:module06:module2"))
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module06.module1"
}
