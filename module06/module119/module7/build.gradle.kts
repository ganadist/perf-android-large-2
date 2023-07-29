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
    api(project(":module06:module009:module3"))
    api(project(":module06:module120:module2"))
    api(project(":module06:module119:module8"))
    api(project(":module06:module119:module9"))
    api(project(":module06:module122:module2"))
    api(project(":module06:module321:module02"))
    api(project(":module06:module336:module1"))
    api("androidx.test:runner:1.1.0")
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("junit:junit:4.13")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module009:module3"))
    implementation(project(":module06:module120:module2"))
    implementation(project(":module06:module119:module4"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module06:module119:module9"))
    implementation(project(":module06:module122:module2"))
    implementation(project(":module06:module282:module2"))
    implementation(project(":module06:module295:module2"))
    implementation(project(":module06:module321:module02"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation("androidx.test.uiautomator:uiautomator:2.2.0")
    implementation("androidx.test:rules:1.1.0")
    implementation("androidx.test:runner:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.google.truth:truth:1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("junit:junit:4.13")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module119.module7"
}
