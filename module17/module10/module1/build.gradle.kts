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
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly(project(":module17:module01:module3"))
    compileOnly("androidx.constraintlayout:constraintlayout:1.1.3")
    compileOnly("androidx.recyclerview:recyclerview:1.0.0")
    compileOnly("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    compileOnly("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    compileOnly("io.reactivex.rxjava2:rxandroid:2.1.1")
    compileOnly("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module17:module08:module3"))
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module17:module01:module3"))
    testImplementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("androidx.recyclerview:recyclerview:1.0.0")
    testImplementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    testImplementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module17.module10.module1"
}
