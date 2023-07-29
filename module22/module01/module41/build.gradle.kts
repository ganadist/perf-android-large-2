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
    api(project(":module06:module161:module1"))
    api(project(":module06:module342:module3"))
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.timber:timber:4.6.1")
    api("com.squareup.okhttp3:logging-interceptor:4.5.0")
    api("com.squareup.okhttp3:okhttp:4.5.0")
    api("com.squareup.retrofit2:converter-wire:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module161:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module33:module1"))
    implementation("com.bugsnag:bugsnag-android:5.0.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")
    implementation("com.squareup.okhttp3:okhttp:4.5.0")
    implementation("com.squareup.retrofit2:converter-wire:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module41"
}
