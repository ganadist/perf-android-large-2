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
    api(project(":module06:module086:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module07:module54"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module14.module3"
}
