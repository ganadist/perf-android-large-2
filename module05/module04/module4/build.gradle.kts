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
    api(project(":module04:module21:module3"))
    api(project(":module05:module12:module4"))
    api(project(":module06:module127"))
    api(project(":module06:module326"))
    api(project(":module06:module353:module1"))
    api(project(":module15:module36:module1"))
    api("com.squareup.okio:okio:2.2.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module04:module21:module3"))
    implementation(project(":module05:module12:module4"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.squareup.okio:okio:2.2.2")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module04.module4"
}
