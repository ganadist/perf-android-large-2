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
    api(project(":module06:module161:module3"))
    api(project(":module06:module295:module6"))
    api(project(":module15:module04:module1"))
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module15:module04:module1"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module107:module5"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module351:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module06.module107.module4"
}
