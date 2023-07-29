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
    androidTestImplementation(project(":module06:module044:module1"))
    androidTestImplementation(project(":module06:module180:module3"))
    androidTestImplementation(project(":module06:module181:module3"))
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module255"))
    androidTestImplementation(project(":module06:module294:module3"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module07:module13:module2"))
    androidTestImplementation(project(":module07:module35"))
    androidTestImplementation(project(":module07:module39:module4:module3"))
    androidTestImplementation(project(":module07:module59:module04:module3"))
    androidTestImplementation(project(":module07:module59:module05:module3"))
    androidTestImplementation(project(":module07:module59:module06:module2"))
    androidTestImplementation(project(":module07:module59:module07:module2"))
    androidTestImplementation(project(":module07:module59:module09:module3"))
    androidTestImplementation(project(":module07:module59:module10:module2"))
    androidTestImplementation(project(":module07:module59:module12:module2"))
    androidTestImplementation(project(":module07:module59:module14:module3"))
    androidTestImplementation(project(":module07:module69:module3"))
    androidTestImplementation(project(":module07:module81:module4"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation(project(":module18:module2:module01:module2"))
    androidTestImplementation(project(":module18:module2:module02:module2"))
    androidTestImplementation(project(":module18:module2:module04:module2"))
    androidTestImplementation(project(":module18:module2:module03:module2"))
    androidTestImplementation(project(":module18:module2:module05:module2"))
    androidTestImplementation(project(":module18:module2:module06:module2"))
    androidTestImplementation(project(":module18:module2:module09:module3"))
    androidTestImplementation(project(":module18:module2:module10:module2"))
    androidTestImplementation(project(":module18:module2:module11:module2"))
    androidTestImplementation(project(":module18:module2:module13:module1"))
    androidTestImplementation(project(":module18:module2:module14:module1"))
    androidTestImplementation(project(":module18:module2:module15:module3"))
    androidTestImplementation(project(":module18:module2:module18:module2"))
    androidTestImplementation(project(":module18:module2:module19:module3"))
    androidTestImplementation(project(":module18:module2:module20:module2"))
    androidTestImplementation(project(":module18:module2:module23:module2"))
    androidTestImplementation(project(":module18:module2:module24:module2"))
    androidTestImplementation(project(":module18:module2:module26:module2"))
    androidTestImplementation(project(":module18:module2:module25:module3"))
    androidTestImplementation(project(":module18:module2:module28:module2"))
    androidTestImplementation(project(":module18:module2:module29:module3"))
    androidTestImplementation(project(":module18:module2:module32:module2"))
    androidTestImplementation(project(":module18:module2:module35:module3"))
    androidTestImplementation(project(":module18:module3:module2:module1"))
    androidTestImplementation(project(":module22:module10:module7"))
    androidTestImplementation(project(":module22:module07:module30"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.squareup.burst:burst-junit4:1.1.1")
    androidTestImplementation("junit:junit:4.13")
    implementation(project(":module22:module01:module18"))
    implementation(project(":module22:module01:module25"))
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module01:module45"))
    implementation(project(":module22:module10:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module10.module3"
}
