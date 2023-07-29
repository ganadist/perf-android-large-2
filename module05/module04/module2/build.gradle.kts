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
    api(project(":module05:module04:module4"))
    api(project(":module06:module336:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module05:module04:module1"))
    implementation(project(":module05:module04:module4"))
    implementation(project(":module06:module043"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module349"))
    implementation(project(":module07:module84"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module04.module2"
}