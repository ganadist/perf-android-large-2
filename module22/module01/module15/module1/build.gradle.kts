plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module06:module345"))
    api(project(":module22:module01:module14"))
    api("com.squareup.coordinators:coordinators:0.5")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module155"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module22:module01:module14"))
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module22.module01.module15.module1"
}
