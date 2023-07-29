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
    androidTestImplementation(project(":module02:module04"))
    androidTestImplementation(project(":module02:module09:module2"))
    androidTestImplementation(project(":module02:module10:module2"))
    androidTestImplementation(project(":module02:module34:module3"))
    androidTestImplementation(project(":module02:module39"))
    androidTestImplementation(project(":module02:module38:module3"))
    androidTestImplementation(project(":module02:module44"))
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module07:module84"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation(project(":module22:module08:module8"))
    androidTestImplementation(project(":module22:module07:module30"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.squareup.burst:burst-junit4:1.1.1")
    androidTestImplementation("junit:junit:4.13")
    implementation(project(":module02:module37:module31"))
    implementation(project(":module22:module01:module18"))
    implementation(project(":module22:module01:module25"))
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module08:module5"))
    implementation("com.bugsnag:bugsnag-android:5.0.0")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module08.module4"
}
