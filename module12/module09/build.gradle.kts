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
    api(project(":module12:module16"))
    implementation(project(":module06:module017:module6"))
    implementation(project(":module06:module021"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module349"))
    implementation(project(":module08:module3"))
    implementation(project(":module07:module40"))
    implementation(project(":module09:module6"))
    implementation(project(":module11"))
    implementation(project(":module12:module04"))
    implementation(project(":module12:module16"))
    implementation(project(":module12:module17"))
    implementation(project(":module12:module20"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module12.module09"
}