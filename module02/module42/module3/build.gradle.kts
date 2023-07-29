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
    api(project(":module02:module42:module5"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module02:module10:module4"))
    implementation(project(":module02:module21:module5"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module38:module3"))
    implementation(project(":module02:module42:module5"))
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module023"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module182:module5"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module15:module02:module1"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("com.evernote:android-job:1.4.1")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module02.module42.module3"
}
