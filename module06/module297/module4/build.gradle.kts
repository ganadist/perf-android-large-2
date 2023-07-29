plugins{
  id("com.android.library")
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
    api(project(":module06:module109:module1"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module296"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module298:module3"))
    api(project(":module06:module315"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module15:module36:module1"))
    api(project(":module15:module47:module1"))
    api(project(":module15:module59:module1"))
    api(project(":module15:module62:module1"))
    api(project(":module15:module66:module1"))
    api("com.squareup.okhttp3:okhttp:4.5.0")
    api("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    api("com.squareup.retrofit2:converter-gson:2.7.2")
    api("com.squareup.retrofit2:converter-wire:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module47:module1"))
    implementation(project(":module15:module59:module1"))
    implementation(project(":module15:module62:module1"))
    implementation(project(":module15:module66:module1"))
    implementation("com.squareup.okhttp3:okhttp:4.5.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation("com.squareup.retrofit2:converter-gson:2.7.2")
    implementation("com.squareup.retrofit2:converter-wire:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module297.module4"
}
