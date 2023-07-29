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
    api(project(":module04:module09:module4"))
    api(project(":module06:module051"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module331"))
    api(project(":module06:module342:module3"))
    api("com.google.dagger:dagger:2.28")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module07"))
    implementation(project(":module01:module14"))
    implementation(project(":module01:module23"))
    implementation(project(":module01:module35"))
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module04:module09:module4"))
    implementation(project(":module05:module01:module02:module5"))
    implementation(project(":module05:module01:module15:module4"))
    implementation(project(":module05:module08:module2"))
    implementation(project(":module05:module10:module03"))
    implementation(project(":module05:module15:module3"))
    implementation(project(":module06:module005:module4"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module026:module7"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module100:module3"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module125"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module144:module4"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module246"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module334:module2"))
    implementation(project(":module06:module342:module3"))
    implementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module05:module08:module2"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module194"))
    testImplementation(project(":module06:module199:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module63"
}
