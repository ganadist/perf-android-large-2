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
    api(project(":module06:module149"))
    api(project(":module06:module178:module6"))
    api(project(":module06:module192"))
    api(project(":module06:module194"))
    api(project(":module06:module207"))
    api(project(":module06:module243"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module345"))
    api(project(":module06:module359"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module359"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module331"
}
