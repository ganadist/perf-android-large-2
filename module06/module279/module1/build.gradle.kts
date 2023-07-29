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
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.google.code.gson:gson:2.8.5")
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.kotlinxCoroutine}")
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module351:module1"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.kotlinxCoroutine}")
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
}

android {
    namespace = "pkg.android.module06.module279.module1"
}
