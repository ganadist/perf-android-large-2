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
    api(project(":module02:module13:module1"))
    api(project(":module02:module13:module3"))
    api(project(":module07:module77:module7"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module02:module13:module1"))
    implementation(project(":module02:module13:module3"))
    implementation(project(":module02:module24:module1:module2"))
    implementation(project(":module02:module25:module3"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module34"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module07:module77:module7"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module13.module2"
}
