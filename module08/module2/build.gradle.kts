plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module021"))
    api(project(":module06:module031:module3"))
    api(project(":module06:module032"))
    api(project(":module06:module139"))
    api(project(":module06:module157"))
    api(project(":module06:module183:module1"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module297:module1"))
    api(project(":module06:module335:module1"))
    api(project(":module06:module336:module1"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module07:module26"))
    api(project(":module07:module45"))
    api(project(":module07:module46"))
    api(project(":module07:module54"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module017:module6"))
    implementation(project(":module06:module021"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module139"))
    implementation(project(":module06:module143:module3"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module183:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module297:module1"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module07:module22:module1"))
    implementation(project(":module07:module26"))
    implementation(project(":module07:module45"))
    implementation(project(":module07:module46"))
    implementation(project(":module07:module54"))
    implementation("androidx.test.espresso:espresso-contrib:3.1.0")
    implementation("androidx.test.uiautomator:uiautomator:2.2.0")
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module08.module2"
}
