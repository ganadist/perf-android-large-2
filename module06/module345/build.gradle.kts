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
    api(project(":module06:module114"))
    api(project(":module06:module194"))
    api(project(":module06:module320:module1"))
    api(project(":module06:module340:module3"))
    api(project(":module06:module342:module3"))
    api("androidx.core:core-ktx:1.2.0")
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module199:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module345"
}
