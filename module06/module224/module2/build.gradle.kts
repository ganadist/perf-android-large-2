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
    api(project(":module06:module013:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module124"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module151"))
    api(project(":module06:module224:module6"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module296"))
    api(project(":module06:module298:module3"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module340:module3"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module124"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module151"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module41:module1"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
}

android {
    namespace = "pkg.android.module06.module224.module2"
}
