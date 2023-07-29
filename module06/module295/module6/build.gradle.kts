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
    api(project(":module06:module321:module10"))
    api(project(":module15:module20:module1"))
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module20:module1"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutine}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.kotlinxCoroutine}")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module351:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutine}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module295.module6"
}
