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
    api(project(":module06:module276:module1"))
    api(project(":module06:module353:module1"))
    api(project(":module07:module21:module08:module5"))
    api(project(":module07:module20:module02:module1"))
    api(project(":module07:module20:module11:module2:module5"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module07:module21:module08:module5"))
    implementation(project(":module07:module20:module02:module1"))
    implementation(project(":module07:module20:module11:module2:module5"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module20.module11.module1.module5"
}
