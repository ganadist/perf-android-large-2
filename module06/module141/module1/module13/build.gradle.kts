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
    api(project(":module05:module12:module4"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module326"))
    api(project(":module06:module353:module1"))
    api(project(":module15:module52:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module12:module4"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module52:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module141.module1.module13"
}
