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
    androidTestImplementation(project(":module06:module026:module5"))
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module07:module08:module6"))
    androidTestImplementation(project(":module07:module77:module5"))
    androidTestImplementation(project(":module09:module6"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module12:module03:module5"))
    androidTestImplementation(project(":module12:module02:module1:module2"))
    androidTestImplementation(project(":module12:module06:module2"))
    androidTestImplementation(project(":module12:module09"))
    androidTestImplementation(project(":module12:module10"))
    androidTestImplementation(project(":module12:module19"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.squareup.burst:burst-junit4:1.1.1")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module12:module08"))
    implementation(project(":module12:module08"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module12.module07"
}
