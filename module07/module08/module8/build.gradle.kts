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
    api(project(":module06:module016:module5"))
    api(project(":module06:module243"))
    api(project(":module06:module295:module6"))
    api(project(":module07:module09:module5"))
    api(project(":module15:module08:module1"))
    api(project(":module15:module36:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module016:module5"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module07:module09:module5"))
    implementation(project(":module15:module08:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module08.module8"
}
