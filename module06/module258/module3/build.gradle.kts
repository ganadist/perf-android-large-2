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
    api(project(":module06:module109:module1"))
    api(project(":module06:module258:module2"))
    api(project(":module06:module258:module4"))
    api(project(":module06:module295:module6"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module258:module2"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module06:module342:module3"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module258.module3"
}
