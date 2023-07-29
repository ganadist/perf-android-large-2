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
    api(project(":module06:module083:module09"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module342:module3"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module342:module3"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module110"
}