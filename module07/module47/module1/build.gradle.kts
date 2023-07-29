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
    androidTestImplementation(project(":module06:module119:module7"))
    androidTestImplementation(project(":module07:module47:module3"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module06:module109:module1"))
    api(project(":module07:module47:module5"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module013:module3"))
    implementation(project(":module06:module097:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module06:module134:module5"))
    implementation(project(":module06:module143:module4"))
    implementation(project(":module06:module178:module5"))
    implementation(project(":module06:module185:module2"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module200:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module297:module1"))
    implementation(project(":module06:module297:module2"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module324:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module07:module47:module4"))
    implementation(project(":module07:module47:module5"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module47.module1"
}
