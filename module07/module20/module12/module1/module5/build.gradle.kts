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
    api(project(":module06:module243"))
    api(project(":module07:module21:module03:module1"))
    api(project(":module07:module21:module04:module5"))
    api(project(":module07:module21:module07:module1"))
    api(project(":module07:module21:module08:module5"))
    api(project(":module07:module21:module11:module5"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module243"))
    implementation(project(":module07:module21:module03:module1"))
    implementation(project(":module07:module21:module04:module5"))
    implementation(project(":module07:module21:module07:module1"))
    implementation(project(":module07:module21:module08:module5"))
    implementation(project(":module07:module21:module11:module5"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module20.module12.module1.module5"
}