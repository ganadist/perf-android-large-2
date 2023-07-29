plugins{
  id("com.android.application")
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
    androidTestImplementation(project(":module06:module203:module1"))
    androidTestImplementation(project(":module06:module307:module1"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module06:module339:module1"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module06:module175"))
    api(project(":module06:module202:module1"))
    api(project(":module06:module207"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module343"))
    api(project(":module24:module1:module1"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.core:core-ktx:1.2.0")
    api("androidx.recyclerview:recyclerview:1.0.0")
    implementation(project(":module06:module175"))
    implementation(project(":module06:module202:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module268"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module321:module01"))
    implementation(project(":module06:module343"))
    implementation(project(":module24:module1:module1"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutine}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutine}")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module20.module6"
}
