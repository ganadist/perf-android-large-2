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
    api(project(":module06:module109:module1"))
    api(project(":module06:module121:module3"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module121:module3"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module337:module3"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.drawerlayout:drawerlayout:1.0.0")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module121.module1"
}