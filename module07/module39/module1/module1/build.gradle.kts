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
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module180:module5"))
    implementation(project(":module07:module39:module2:module5"))
    implementation(project(":module18:module1:module16:module4"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module067"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module39:module2:module1"))
    testImplementation(project(":module15:module39:module1"))
    testImplementation(project(":module18:module1:module16:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
}

android {
    namespace = "pkg.android.module07.module39.module1.module1"
}
