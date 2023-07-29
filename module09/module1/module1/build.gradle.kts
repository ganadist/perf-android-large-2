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
    api(project(":module01:module01"))
    api(project(":module06:module008"))
    api(project(":module06:module353:module2"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module01"))
    implementation(project(":module01:module20"))
    implementation(project(":module06:module008"))
    implementation(project(":module06:module023"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module046:module5"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module212"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module240"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module10"))
    implementation("com.evernote:android-job:1.4.1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module024"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module235"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module330"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.okio:okio:2.2.2")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module09.module1.module1"
}