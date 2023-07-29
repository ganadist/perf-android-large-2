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
    api(project(":module06:module297:module4"))
    api(project(":module06:module339:module2"))
    api("com.google.truth:truth:1.0")
    api("com.squareup.retrofit2:retrofit-mock:2.7.2")
    api("junit:junit:4.13")
    api(libs.kotlin.stdlib)
    api("org.mockito:mockito-core:2.28.2")
    api("org.robolectric:robolectric:4.3")
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module339:module2"))
    implementation(project(":module06:module351:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.truth:truth:1.0")
    implementation("com.squareup.retrofit2:retrofit-mock:2.7.2")
    implementation("junit:junit:4.13")
    implementation(libs.kotlin.stdlib)
    implementation("org.mockito:mockito-core:2.28.2")
    implementation("org.robolectric:robolectric:4.3")
    testImplementation(project(":module06:module156:module3"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.okhttp3:mockwebserver:4.5.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module297.module5"
}
