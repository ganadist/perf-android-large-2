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
    api(project(":module06:module295:module4"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module321:module10"))
    api("com.google.code.gson:gson:2.8.5")
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    api("com.squareup.retrofit2:converter-gson:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module295:module4"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module321:module10"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation("com.squareup.retrofit2:converter-gson:2.7.2")
    implementation("com.squareup.retrofit2:converter-wire:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.core)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module295.module5"
}
