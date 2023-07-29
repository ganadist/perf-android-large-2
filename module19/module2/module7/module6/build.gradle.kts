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
    api(project(":module07:module13:module3"))
    api(project(":module07:module31:module2"))
    api(project(":module19:module2:module3:module2"))
    api(project(":module19:module2:module7:module4"))
    api(project(":module19:module2:module7:module7"))
    api(project(":module19:module2:module8:module3"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module07:module13:module3"))
    implementation(project(":module07:module31:module2"))
    implementation(project(":module19:module2:module3:module2"))
    implementation(project(":module19:module2:module7:module4"))
    implementation(project(":module19:module2:module7:module7"))
    implementation(project(":module19:module2:module8:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module19.module2.module7.module6"
}
