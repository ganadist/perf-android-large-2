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
    api(project(":module06:module084"))
    api("com.google.truth:truth:1.0")
    api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    api("junit:junit:4.13")
    api("org.mockito:mockito-core:2.28.2")
    implementation(project(":module06:module084"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module337:module4"))
    implementation("com.google.truth:truth:1.0")
    implementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    implementation("junit:junit:4.13")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("androidx.appcompat:appcompat:1.1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.3.7")
}

android {
    namespace = "pkg.android.module06.module089"
}
