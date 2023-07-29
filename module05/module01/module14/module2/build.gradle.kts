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
    api(project(":module05:module01:module14:module4"))
    api(project(":module06:module195"))
    api(project(":module06:module243"))
    api(project(":module06:module336:module1"))
    api(project(":module06:module349"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module05:module01:module14:module1"))
    implementation(project(":module05:module01:module14:module4"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module349"))
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module01.module14.module2"
}
