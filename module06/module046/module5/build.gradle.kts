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
    api(project(":module06:module008"))
    api(project(":module06:module048"))
    api(project(":module06:module155"))
    api(project(":module06:module192"))
    api(project(":module06:module297:module4"))
    api(project(":module06:module340:module3"))
    api(project(":module15:module05:module2"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.coordinators:coordinators:0.5")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module008"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module05:module2"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module046.module5"
}
