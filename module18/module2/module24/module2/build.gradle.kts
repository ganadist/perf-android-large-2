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
    api(project(":module06:module336:module1"))
    api(project(":module18:module2:module24:module4"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module336:module1"))
    implementation(project(":module07:module59:module06:module2"))
    implementation(project(":module18:module1:module13:module1"))
    implementation(project(":module18:module2:module24:module1"))
    implementation(project(":module18:module2:module24:module4"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module24.module2"
}
