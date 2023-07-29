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
    api(project(":module06:module067"))
    api(project(":module06:module276:module1"))
    api(project(":module18:module1:module06:module1"))
    api(project(":module18:module1:module07:module3"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module067"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module18:module1:module06:module1"))
    implementation(project(":module18:module1:module07:module3"))
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module1.module26.module4"
}
