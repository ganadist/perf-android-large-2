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
    api(project(":module05:module08:module2"))
    api(project(":module06:module336:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module08:module2"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module332"))
    implementation(project(":module06:module334:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module06:module348"))
    implementation(project(":module07:module63"))
    implementation(project(":module15:module21:module1"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("com.google.truth:truth:1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module08.module1"
}
