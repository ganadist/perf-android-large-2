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
    api(project(":module06:module138:module3"))
    api("com.squareup.sqldelight:runtime-jvm:1.2.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module138:module3"))
    implementation(project(":module15:module34:module1"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi:1.9.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.sqldelight:android-driver:1.2.2")
    implementation("com.squareup.sqldelight:runtime-jvm:1.2.2")
    implementation("com.squareup.sqldelight:rxjava2-extensions:1.2.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("androidx.test:core:1.1.0")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.sqldelight:sqlite-driver:1.2.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module06.module138.module1"
}