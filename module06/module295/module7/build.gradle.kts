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
    api(project(":module06:module295:module6"))
    api("com.squareup.retrofit2:retrofit-mock:2.7.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module295:module6"))
    implementation("com.squareup.retrofit2:retrofit-mock:2.7.2")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.rx2)
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation(libs.kotlinx.coroutines.test)
}

android {
    namespace = "pkg.android.module06.module295.module7"
}
