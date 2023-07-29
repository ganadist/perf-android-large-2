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
    api(project(":module06:module298:module3"))
    api(project(":module13:module3:module3"))
    api("com.squareup.sqldelight:runtime-jvm:1.2.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module13:module3:module3"))
    implementation("com.squareup.sqldelight:android-driver:1.2.2")
    implementation("com.squareup.sqldelight:coroutines-extensions:1.2.2")
    implementation("com.squareup.sqldelight:runtime-jvm:1.2.2")
    implementation("com.squareup.sqldelight:sqlite-driver:1.2.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module13.module3.module1"
}
