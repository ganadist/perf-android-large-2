plugins{
  id("com.android.library")
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
    androidTestImplementation(project(":module15:module34:module1"))
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.truth:truth:1.0")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:4.5.0")
    androidTestImplementation("junit:junit:4.13")
    androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    api(project(":module06:module138:module1"))
    api(project(":module06:module138:module3"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module138:module1"))
    implementation(project(":module06:module138:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation("com.squareup.retrofit2:converter-wire:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module138.module2"
}
