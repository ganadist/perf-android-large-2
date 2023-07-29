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
    api(project(":module06:module014:module1"))
    api(project(":module06:module063:module6"))
    api(project(":module15:module32:module1"))
    api(project(":module15:module33:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module014:module1"))
    implementation(project(":module06:module063:module6"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module32:module1"))
    implementation(project(":module15:module33:module1"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module013.module6"
}
