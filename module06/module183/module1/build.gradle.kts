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
    api(project(":module06:module109:module1"))
    api(project(":module06:module183:module7"))
    api(project(":module06:module298:module3"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module183:module7"))
    implementation(project(":module06:module298:module3"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module183.module1"
}
