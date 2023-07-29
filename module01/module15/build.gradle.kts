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
    api(project(":module06:module243"))
    api(project(":module06:module254"))
    api(project(":module06:module342:module3"))
    api("com.squareup.okio:okio:2.2.2")
    implementation(project(":module06:module243"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module01.module15"
}
