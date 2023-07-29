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
    api(project(":module02:module37:module09:module1"))
    api(project(":module02:module37:module13:module1"))
    api(project(":module02:module37:module24:module1"))
    api(project(":module02:module37:module29:module1"))
    api("com.google.code.findbugs:jsr305:3.0.2")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module37:module09:module1"))
    implementation(project(":module02:module37:module13:module1"))
    implementation(project(":module02:module37:module24:module1"))
    implementation(project(":module02:module37:module29:module1"))
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module23.module3"
}
