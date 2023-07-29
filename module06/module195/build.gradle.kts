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
    api("androidx.test.espresso:espresso-core:3.1.0")
    api("org.hamcrest:hamcrest-core:1.3")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module114"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("androidx.test.uiautomator:uiautomator:2.2.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.truth:truth:1.0")
    implementation("org.hamcrest:hamcrest-core:1.3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module195"
}
