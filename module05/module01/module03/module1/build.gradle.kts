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
    api(project(":module05:module01:module03:module5"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module295:module1"))
    api(project(":module06:module295:module6"))
    api(project(":module15:module18:module1"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module01:module03:module5"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module295:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module15:module18:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module01.module03.module1"
}
