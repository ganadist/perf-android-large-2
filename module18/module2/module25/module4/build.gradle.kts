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
    api(project(":module06:module027:module2"))
    api(project(":module06:module055:module2"))
    api(project(":module06:module056:module2"))
    api(project(":module07:module13:module3"))
    api(project(":module07:module39:module4:module4"))
    api(project(":module07:module81:module5"))
    api(project(":module18:module1:module08:module2"))
    api(project(":module18:module1:module09:module3"))
    api(project(":module18:module1:module10:module3"))
    api(project(":module18:module1:module16:module3"))
    api(project(":module18:module1:module17:module3"))
    api(project(":module18:module1:module19:module3"))
    api(project(":module18:module1:module21:module2"))
    api(project(":module18:module1:module24:module2"))
    api(project(":module18:module1:module23:module3"))
    api(project(":module18:module1:module27:module4"))
    api(project(":module18:module2:module01:module3"))
    api(project(":module18:module2:module02:module3"))
    api(project(":module18:module2:module04:module3"))
    api(project(":module18:module2:module03:module3"))
    api(project(":module18:module2:module06:module3"))
    api(project(":module18:module2:module09:module4"))
    api(project(":module18:module2:module10:module3"))
    api(project(":module18:module2:module11:module3"))
    api(project(":module18:module2:module12:module2"))
    api(project(":module18:module2:module16:module3"))
    api(project(":module18:module2:module17:module2"))
    api(project(":module18:module2:module20:module3"))
    api(project(":module18:module2:module23:module3"))
    api(project(":module18:module2:module26:module3"))
    api(project(":module18:module2:module25:module2"))
    api(project(":module18:module2:module25:module5"))
    api(project(":module18:module2:module28:module3"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module027:module2"))
    implementation(project(":module06:module055:module2"))
    implementation(project(":module06:module056:module2"))
    implementation(project(":module07:module13:module3"))
    implementation(project(":module07:module39:module4:module4"))
    implementation(project(":module07:module81:module5"))
    implementation(project(":module18:module1:module08:module2"))
    implementation(project(":module18:module1:module09:module3"))
    implementation(project(":module18:module1:module10:module3"))
    implementation(project(":module18:module1:module16:module3"))
    implementation(project(":module18:module1:module17:module3"))
    implementation(project(":module18:module1:module19:module3"))
    implementation(project(":module18:module1:module21:module2"))
    implementation(project(":module18:module1:module24:module2"))
    implementation(project(":module18:module1:module23:module3"))
    implementation(project(":module18:module1:module27:module4"))
    implementation(project(":module18:module2:module01:module3"))
    implementation(project(":module18:module2:module02:module3"))
    implementation(project(":module18:module2:module04:module3"))
    implementation(project(":module18:module2:module03:module3"))
    implementation(project(":module18:module2:module06:module3"))
    implementation(project(":module18:module2:module09:module4"))
    implementation(project(":module18:module2:module10:module3"))
    implementation(project(":module18:module2:module11:module3"))
    implementation(project(":module18:module2:module12:module2"))
    implementation(project(":module18:module2:module16:module3"))
    implementation(project(":module18:module2:module17:module2"))
    implementation(project(":module18:module2:module20:module3"))
    implementation(project(":module18:module2:module23:module3"))
    implementation(project(":module18:module2:module26:module3"))
    implementation(project(":module18:module2:module25:module2"))
    implementation(project(":module18:module2:module25:module5"))
    implementation(project(":module18:module2:module28:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module25.module4"
}
