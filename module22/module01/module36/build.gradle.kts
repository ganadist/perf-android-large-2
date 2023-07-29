plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module01:module34"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module313:module5"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module33"))
    implementation(project(":module01:module34"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module314:module5"))
    implementation(project(":module10"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module35"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module01.module36"
}
