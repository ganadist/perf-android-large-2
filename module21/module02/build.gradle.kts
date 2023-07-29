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
    androidTestImplementation(project(":module04:module19:module4"))
    androidTestImplementation(project(":module05:module01:module14:module2"))
    androidTestImplementation(project(":module05:module01:module15:module2"))
    androidTestImplementation(project(":module05:module04:module2"))
    androidTestImplementation(project(":module05:module05:module4"))
    androidTestImplementation(project(":module05:module08:module1"))
    androidTestImplementation(project(":module05:module10:module10"))
    androidTestImplementation(project(":module05:module14:module1:module2"))
    androidTestImplementation(project(":module06:module001:module3"))
    androidTestImplementation(project(":module06:module005:module2"))
    androidTestImplementation(project(":module06:module017:module6"))
    androidTestImplementation(project(":module06:module021"))
    androidTestImplementation(project(":module06:module026:module5"))
    androidTestImplementation(project(":module06:module039:module3"))
    androidTestImplementation(project(":module06:module041:module7"))
    androidTestImplementation(project(":module06:module044:module1"))
    androidTestImplementation(project(":module06:module052"))
    androidTestImplementation(project(":module06:module083:module03"))
    androidTestImplementation(project(":module06:module093:module1"))
    androidTestImplementation(project(":module06:module103:module1:module4"))
    androidTestImplementation(project(":module06:module113:module4"))
    androidTestImplementation(project(":module06:module140:module6"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation(project(":module06:module144:module2"))
    androidTestImplementation(project(":module06:module164:module4"))
    androidTestImplementation(project(":module06:module185:module1"))
    androidTestImplementation(project(":module06:module185:module6"))
    androidTestImplementation(project(":module06:module190:module3"))
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module277:module4"))
    androidTestImplementation(project(":module06:module301:module2"))
    androidTestImplementation(project(":module06:module303:module3"))
    androidTestImplementation(project(":module06:module318:module1"))
    androidTestImplementation(project(":module06:module332"))
    androidTestImplementation(project(":module06:module334:module1"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module06:module340:module4"))
    androidTestImplementation(project(":module08:module1"))
    androidTestImplementation(project(":module07:module03:module2"))
    androidTestImplementation(project(":module07:module05:module3"))
    androidTestImplementation(project(":module07:module07:module4"))
    androidTestImplementation(project(":module07:module08:module6"))
    androidTestImplementation(project(":module07:module09:module3"))
    androidTestImplementation(project(":module07:module10:module3"))
    androidTestImplementation(project(":module07:module11:module3"))
    androidTestImplementation(project(":module07:module19:module2"))
    androidTestImplementation(project(":module07:module32:module3"))
    androidTestImplementation(project(":module07:module35"))
    androidTestImplementation(project(":module07:module42:module2"))
    androidTestImplementation(project(":module07:module44:module2"))
    androidTestImplementation(project(":module07:module47:module3"))
    androidTestImplementation(project(":module07:module52:module3"))
    androidTestImplementation(project(":module07:module56:module4"))
    androidTestImplementation(project(":module07:module57:module5"))
    androidTestImplementation(project(":module07:module65:module2"))
    androidTestImplementation(project(":module07:module67:module2"))
    androidTestImplementation(project(":module07:module69:module3"))
    androidTestImplementation(project(":module07:module74:module3"))
    androidTestImplementation(project(":module07:module84"))
    androidTestImplementation(project(":module07:module86:module3"))
    androidTestImplementation(project(":module07:module89"))
    androidTestImplementation(project(":module09:module6"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module14:module2"))
    androidTestImplementation(project(":module21:module04"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.truth:truth:1.0")
    androidTestImplementation("com.squareup.burst:burst-junit4:1.1.1")
    androidTestImplementation("junit:junit:4.13")
    implementation(project(":module21:module03"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module21.module02"
}
