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
    api("junit:junit:4.13")
    api("org.hamcrest:hamcrest-core:1.3")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module114"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("junit:junit:4.13")
    implementation("org.hamcrest:hamcrest-core:1.3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module335.module1"
}
