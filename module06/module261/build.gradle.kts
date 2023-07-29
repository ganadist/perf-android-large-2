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
    implementation(project(":module06:module013:module3"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module297:module5"))
    implementation(project(":module06:module298:module4"))
    implementation(project(":module06:module340:module4"))
    implementation(project(":module06:module339:module2"))
    implementation(project(":module15:module36:module1"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.squareup:tape:1.2.3")
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module261"
}
