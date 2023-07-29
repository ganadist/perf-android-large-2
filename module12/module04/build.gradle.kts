plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module01:module06"))
    api(project(":module01:module38"))
    api(project(":module06:module098"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module267:module1"))
    api(project(":module07:module40"))
    api(project(":module15:module31:module1"))
    implementation(project(":module01:module06"))
    implementation(project(":module01:module21"))
    implementation(project(":module01:module38"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module098"))
    implementation(project(":module06:module100:module4"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module348"))
    implementation(project(":module07:module40"))
    implementation(project(":module07:module41:module5"))
    implementation(project(":module07:module42:module3"))
    implementation(project(":module07:module42:module4"))
    implementation(project(":module07:module77:module7"))
    implementation(project(":module10"))
    implementation(project(":module12:module03:module7"))
    implementation(project(":module12:module02:module1:module4"))
    implementation(project(":module12:module18"))
    implementation(project(":module15:module31:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module31:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module12.module04"
}
