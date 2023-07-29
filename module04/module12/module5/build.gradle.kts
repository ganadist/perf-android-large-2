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
    api(project(":module04:module01:module1"))
    api(project(":module04:module03:module2"))
    api(project(":module04:module03:module3"))
    api(project(":module04:module04:module1"))
    api(project(":module04:module04:module2"))
    api(project(":module04:module07:module1"))
    api(project(":module04:module09:module3"))
    api(project(":module04:module11:module2"))
    api(project(":module04:module12:module1"))
    api(project(":module04:module12:module6"))
    api(project(":module04:module14"))
    api(project(":module04:module17:module6"))
    api(project(":module04:module20"))
    api(project(":module04:module22"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module279:module1"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module298:module3"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module04:module01:module1"))
    implementation(project(":module04:module03:module2"))
    implementation(project(":module04:module03:module3"))
    implementation(project(":module04:module04:module1"))
    implementation(project(":module04:module04:module2"))
    implementation(project(":module04:module06"))
    implementation(project(":module04:module07:module1"))
    implementation(project(":module04:module09:module3"))
    implementation(project(":module04:module11:module2"))
    implementation(project(":module04:module12:module1"))
    implementation(project(":module04:module12:module6"))
    implementation(project(":module04:module14"))
    implementation(project(":module04:module17:module6"))
    implementation(project(":module04:module20"))
    implementation(project(":module04:module22"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module298:module3"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.core)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module04.module12.module5"
}
