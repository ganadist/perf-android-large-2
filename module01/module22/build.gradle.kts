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
    api(project(":module06:module149"))
    api(project(":module06:module224:module4"))
    api(project(":module06:module243"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module224:module4"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module348"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module01.module22"
}
