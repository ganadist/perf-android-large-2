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
    api(project(":module07:module24"))
    api(project(":module07:module68"))
    api(project(":module09:module2"))
    api(project(":module09:module5"))
    api(project(":module10"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module207"))
    implementation(project(":module07:module08:module8"))
    implementation(project(":module07:module24"))
    implementation(project(":module07:module68"))
    implementation(project(":module07:module78"))
    implementation(project(":module09:module2"))
    implementation(project(":module09:module5"))
    implementation(project(":module10"))
    implementation(project(":module12:module01"))
    implementation(project(":module12:module05:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module12.module15"
}
