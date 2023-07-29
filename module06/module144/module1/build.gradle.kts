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
    api(project(":module06:module144:module4"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module144:module4"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
}

android {
    namespace = "pkg.android.module06.module144.module1"
}
