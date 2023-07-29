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
    androidTestImplementation(project(":module02:module14:module3"))
    androidTestImplementation(project(":module02:module15:module3"))
    androidTestImplementation(project(":module02:module16:module3"))
    androidTestImplementation(project(":module02:module24:module1:module1"))
    androidTestImplementation(project(":module06:module119:module7"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module02:module16:module5"))
    api(project(":module06:module109:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module02:module13:module2"))
    implementation(project(":module02:module16:module4"))
    implementation(project(":module02:module16:module5"))
    implementation(project(":module02:module24:module1:module2"))
    implementation(project(":module02:module37:module10:module4"))
    implementation(project(":module02:module37:module34"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module06:module007:module2"))
    implementation(project(":module06:module016:module3"))
    implementation(project(":module06:module017:module2"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module324:module3"))
    implementation(project(":module07:module77:module4"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module16.module1"
}
