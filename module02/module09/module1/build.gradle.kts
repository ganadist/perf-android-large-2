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
    api(project(":module02:module09:module4"))
    api(project(":module06:module162:module3"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module02:module01:module1"))
    implementation(project(":module02:module09:module4"))
    implementation(project(":module02:module21:module5"))
    implementation(project(":module02:module25:module3"))
    implementation(project(":module02:module26:module5"))
    implementation(project(":module02:module37:module11:module1"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module45"))
    implementation(project(":module02:module46:module1"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module275:module3"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module09.module1"
}
