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
    api(project(":module01:module21"))
    api(project(":module01:module30"))
    api(project(":module05:module07:module4"))
    api(project(":module06:module067"))
    api(project(":module06:module243"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module353:module1"))
    api(project(":module06:module353:module2"))
    implementation(project(":module01:module21"))
    implementation(project(":module01:module30"))
    implementation(project(":module05:module07:module4"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module15:module36:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module01.module23"
}
