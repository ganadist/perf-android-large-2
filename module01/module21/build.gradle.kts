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
    api(project(":module06:module243"))
    api(project(":module06:module353:module1"))
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module243"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module01.module21"
}
