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
    api("androidx.core:core-ktx:1.2.0")
    api("androidx.test:runner:1.1.0")
    api("com.facebook.testing.screenshot:core:0.8.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module337:module3"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.test:runner:1.1.0")
    implementation("com.facebook.testing.screenshot:core:0.8.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module307.module1"
}
