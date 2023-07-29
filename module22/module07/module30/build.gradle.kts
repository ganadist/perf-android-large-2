plugins{
  id("com.android.library")
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
    api(project(":module05:module01:module14:module2"))
    api(project(":module05:module07:module2"))
    api(project(":module05:module08:module1"))
    api(project(":module05:module10:module10"))
    api(project(":module05:module14:module1:module2"))
    api(project(":module06:module001:module3"))
    api(project(":module08:module3"))
    api(project(":module07:module03:module2"))
    api(project(":module07:module84"))
    api(project(":module09:module6"))
    api(project(":module11"))
    api(project(":module14:module2"))
    api(project(":module22:module01:module13"))
    api(project(":module22:module01:module18"))
    api(project(":module22:module01:module19"))
    api(project(":module22:module01:module27"))
    api(project(":module22:module01:module37"))
    api(project(":module22:module07:module05:module1"))
    api(project(":module22:module07:module06:module1"))
    api(project(":module22:module07:module09:module2"))
    api(project(":module22:module07:module11:module1"))
    api(project(":module22:module07:module16"))
    api(project(":module22:module07:module27"))
    api(project(":module22:module07:module29"))
    api(project(":module22:module07:module31"))
    implementation(project(":module05:module01:module14:module2"))
    implementation(project(":module05:module07:module2"))
    implementation(project(":module05:module08:module1"))
    implementation(project(":module05:module10:module10"))
    implementation(project(":module05:module14:module1:module2"))
    implementation(project(":module06:module001:module3"))
    implementation(project(":module06:module038"))
    implementation(project(":module06:module122:module4"))
    implementation(project(":module06:module143:module3"))
    implementation(project(":module06:module187:module1"))
    implementation(project(":module06:module332"))
    implementation(project(":module06:module334:module1"))
    implementation(project(":module08:module3"))
    implementation(project(":module07:module03:module2"))
    implementation(project(":module07:module22:module1"))
    implementation(project(":module07:module44:module2"))
    implementation(project(":module07:module84"))
    implementation(project(":module07:module89"))
    implementation(project(":module09:module6"))
    implementation(project(":module11"))
    implementation(project(":module14:module2"))
    implementation(project(":module22:module01:module13"))
    implementation(project(":module22:module01:module18"))
    implementation(project(":module22:module01:module19"))
    implementation(project(":module22:module01:module27"))
    implementation(project(":module22:module01:module37"))
    implementation(project(":module22:module07:module05:module1"))
    implementation(project(":module22:module07:module06:module1"))
    implementation(project(":module22:module07:module09:module2"))
    implementation(project(":module22:module07:module11:module1"))
    implementation(project(":module22:module07:module16"))
    implementation(project(":module22:module07:module27"))
    implementation(project(":module22:module07:module29"))
    implementation(project(":module22:module07:module31"))
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module30"
}
