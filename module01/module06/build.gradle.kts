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
    api(project(":module05:module01:module02:module5"))
    api(project(":module05:module04:module4"))
    api(project(":module05:module10:module12"))
    api(project(":module06:module250:module4"))
    api(project(":module06:module326"))
    api(project(":module06:module353:module5"))
    api("com.squareup.okio:okio:2.2.2")
    implementation(project(":module01:module27"))
    implementation(project(":module01:module30"))
    implementation(project(":module05:module01:module02:module5"))
    implementation(project(":module05:module04:module4"))
    implementation(project(":module05:module10:module12"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module141:module1:module13"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module353:module5"))
    implementation(project(":module15:module36:module1"))
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module01.module06"
}