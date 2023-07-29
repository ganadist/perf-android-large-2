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
    api(project(":module06:module028"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module298:module3"))
    api(project(":module06:module326"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module339:module2"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module05:module03:module2"))
    implementation(project(":module06:module028"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module083:module10"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module261"))
    implementation(project(":module06:module295:module7"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module298:module4"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module327:module3"))
    implementation(project(":module06:module330"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module339:module2"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("junit:junit:4.13")
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module029"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module156:module3"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module328:module1"))
    testImplementation(project(":module06:module327:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module235"
}