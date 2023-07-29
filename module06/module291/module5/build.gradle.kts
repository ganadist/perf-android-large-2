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
    api(project(":module01:module27"))
    api(project(":module01:module29"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module27"))
    implementation(project(":module01:module29"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module291.module5"
}
