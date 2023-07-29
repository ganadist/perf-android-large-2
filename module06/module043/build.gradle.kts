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
    api(project(":module06:module192"))
    api(project(":module06:module201:module1"))
    api(project(":module06:module345"))
    api(project(":module06:module353:module1"))
    api(project(":module06:module353:module2"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module043"
}