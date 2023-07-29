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
    api(project(":module01:module19"))
    api(project(":module22:module01:module35"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module19"))
    implementation(project(":module01:module33"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module39"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module12"
}
