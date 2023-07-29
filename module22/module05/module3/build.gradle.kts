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
    androidTestImplementation(project(":module05:module01:module14:module2"))
    androidTestImplementation(project(":module05:module01:module15:module2"))
    androidTestImplementation(project(":module05:module08:module1"))
    androidTestImplementation(project(":module05:module10:module10"))
    androidTestImplementation(project(":module05:module14:module1:module2"))
    androidTestImplementation(project(":module06:module003:module2"))
    androidTestImplementation(project(":module06:module021"))
    androidTestImplementation(project(":module06:module039:module3"))
    androidTestImplementation(project(":module06:module047:module2"))
    androidTestImplementation(project(":module06:module044:module1"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module255"))
    androidTestImplementation(project(":module06:module290:module2"))
    androidTestImplementation(project(":module06:module334:module1"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module07:module08:module6"))
    androidTestImplementation(project(":module07:module44:module2"))
    androidTestImplementation(project(":module07:module76"))
    androidTestImplementation(project(":module07:module84"))
    androidTestImplementation(project(":module09:module6"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation(project(":module22:module01:module01:module2"))
    androidTestImplementation(project(":module22:module01:module13"))
    androidTestImplementation(project(":module22:module01:module17:module1"))
    androidTestImplementation(project(":module22:module01:module19"))
    androidTestImplementation(project(":module22:module01:module27"))
    androidTestImplementation(project(":module22:module01:module34"))
    androidTestImplementation(project(":module22:module01:module37"))
    androidTestImplementation(project(":module22:module05:module5"))
    androidTestImplementation(project(":module22:module04:module12"))
    androidTestImplementation(project(":module22:module04:module14"))
    androidTestImplementation(project(":module22:module04:module15:module3"))
    androidTestImplementation(project(":module22:module04:module16"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.squareup.burst:burst-junit4:1.1.1")
    androidTestImplementation("junit:junit:4.13")
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module05:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module05.module3"
}
