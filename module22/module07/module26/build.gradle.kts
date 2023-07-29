plugins{
  id("com.android.application")
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
    androidTestImplementation(project(":module06:module307:module1"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module06:module339:module1"))
    androidTestImplementation(project(":module22:module07:module06:module2"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module06:module175"))
    api(project(":module06:module207"))
    api(project(":module22:module07:module16"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.core:core-ktx:1.2.0")
    api("androidx.recyclerview:recyclerview:1.0.0")
    implementation(project(":module06:module175"))
    implementation(project(":module06:module207"))
    implementation(project(":module22:module07:module16"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module26"
}
