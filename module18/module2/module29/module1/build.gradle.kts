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
    androidTestImplementation(project(":module18:module2:module29:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module18:module2:module29:module5"))
    api(project(":module18:module3:module2:module2"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module18:module2:module29:module4"))
    implementation(project(":module18:module2:module29:module5"))
    implementation(project(":module18:module3:module2:module2"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module29.module1"
}
