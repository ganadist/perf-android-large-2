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
    api(project(":module06:module194"))
    api(project(":module06:module345"))
    api(project(":module06:module357"))
    api("androidx.recyclerview:recyclerview:1.0.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module357"))
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module038"
}
