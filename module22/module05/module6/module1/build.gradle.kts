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
    api(project(":module06:module149"))
    api(project(":module06:module339:module1"))
    api(project(":module07:module44:module4"))
    api(project(":module09:module2"))
    api(project(":module22:module01:module26"))
    api(project(":module22:module05:module6:module3"))
    api(project(":module22:module04:module07"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module07:module44:module4"))
    implementation(project(":module09:module2"))
    implementation(project(":module22:module01:module26"))
    implementation(project(":module22:module05:module6:module3"))
    implementation(project(":module22:module04:module07"))
    implementation(project(":module22:module04:module17"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module05.module6.module1"
}