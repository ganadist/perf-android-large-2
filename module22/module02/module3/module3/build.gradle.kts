plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module06:module295:module6"))
    api(project(":module15:module30:module1"))
    api(project(":module15:module36:module1"))
    api(project(":module22:module01:module21"))
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module15:module30:module1"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module22:module01:module21"))
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module02.module3.module3"
}