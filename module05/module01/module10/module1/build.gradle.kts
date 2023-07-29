plugins{
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
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
    androidTestImplementation(project(":module05:module01:module03:module2"))
    androidTestImplementation(project(":module05:module01:module03:module3"))
    androidTestImplementation(project(":module05:module01:module04:module2"))
    androidTestImplementation(project(":module05:module01:module05:module2"))
    androidTestImplementation(project(":module05:module01:module12:module2"))
    androidTestImplementation(project(":module05:module01:module15:module2"))
    androidTestImplementation(project(":module05:module10:module10"))
    androidTestImplementation(project(":module06:module044:module1"))
    androidTestImplementation(project(":module06:module119:module7"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation(project(":module06:module347"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module05:module01:module10:module5"))
    api(project(":module06:module109:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module05:module01:module01:module2"))
    implementation(project(":module05:module01:module03:module4"))
    implementation(project(":module05:module01:module04:module3"))
    implementation(project(":module05:module01:module05:module3"))
    implementation(project(":module05:module01:module05:module4"))
    implementation(project(":module05:module01:module07:module2"))
    implementation(project(":module05:module01:module10:module4"))
    implementation(project(":module05:module01:module10:module5"))
    implementation(project(":module05:module01:module11:module4"))
    implementation(project(":module05:module01:module12:module3"))
    implementation(project(":module05:module01:module13:module2"))
    implementation(project(":module05:module01:module15:module3"))
    implementation(project(":module05:module03:module2"))
    implementation(project(":module05:module11:module3"))
    implementation(project(":module05:module10:module07"))
    implementation(project(":module05:module10:module09"))
    implementation(project(":module06:module013:module4"))
    implementation(project(":module06:module039:module4"))
    implementation(project(":module06:module061:module2"))
    implementation(project(":module06:module079:module1"))
    implementation(project(":module06:module083:module07"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module06:module143:module4"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module163:module3"))
    implementation(project(":module06:module182:module2"))
    implementation(project(":module06:module200:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module287:module2"))
    implementation(project(":module06:module294:module2"))
    implementation(project(":module06:module313:module3"))
    implementation(project(":module06:module314:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module01.module10.module1"
}
