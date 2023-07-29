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
    api(project(":module06:module090:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module149"))
    api(project(":module06:module150"))
    api(project(":module06:module243"))
    api(project(":module06:module296"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module345"))
    api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    api("com.squareup.okio:okio:2.2.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module150"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module15:module36:module1"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module002:module2"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module011"
}
