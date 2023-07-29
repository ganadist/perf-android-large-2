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
    api(project(":module06:module109:module1"))
    api(project(":module06:module357"))
    api(project(":module22:module07:module02:module5"))
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module357"))
    implementation(project(":module22:module07:module02:module5"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module02.module3"
}
