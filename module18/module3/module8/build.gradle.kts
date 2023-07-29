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
    api(project(":module06:module210:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module18:module1:module19:module4"))
    implementation(project(":module18:module1:module25:module1"))
    implementation(project(":module18:module3:module9"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module18.module3.module8"
}
