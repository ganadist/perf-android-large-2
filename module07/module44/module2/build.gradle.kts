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
    api(project(":module07:module44:module4"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module008"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module07:module44:module1"))
    implementation(project(":module07:module44:module4"))
    implementation(project(":module10"))
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module44.module2"
}
