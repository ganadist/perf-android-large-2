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
    api(project(":module07:module44:module3"))
    api(project(":module07:module44:module4"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module339:module1"))
    implementation(project(":module07:module44:module3"))
    implementation(project(":module07:module44:module4"))
    implementation(project(":module09:module2"))
    implementation(project(":module22:module01:module26"))
    implementation(project(":module22:module07:module19"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module09.module03"
}