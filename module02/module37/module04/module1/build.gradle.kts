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
    api(project(":module02:module37:module04:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module02:module37:module04:module3"))
    implementation(project(":module02:module37:module11:module1"))
    implementation(project(":module06:module282:module1"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module02:module37:module04:module4"))
    testImplementation(project(":module02:module37:module32"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module02.module37.module04.module1"
}
