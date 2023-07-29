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
    api(project(":module02:module36:module4"))
    api(project(":module02:module42:module4"))
    api(project(":module03:module01:module1:module3"))
    api(project(":module04:module10:module1"))
    api(project(":module04:module10:module3"))
    api(project(":module04:module12:module3"))
    api(project(":module05:module01:module14:module3"))
    api(project(":module06:module006:module2"))
    api(project(":module06:module004:module3"))
    api(project(":module06:module007:module4"))
    api(project(":module06:module017:module7"))
    api(project(":module06:module054:module5"))
    api(project(":module06:module063:module5"))
    api(project(":module06:module075:module3"))
    api(project(":module06:module083:module08"))
    api(project(":module06:module094:module2"))
    api(project(":module06:module103:module2:module5"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module112:module4"))
    api(project(":module06:module140:module7"))
    api(project(":module06:module141:module1:module08"))
    api(project(":module06:module156:module2"))
    api(project(":module06:module171:module3"))
    api(project(":module06:module170:module3"))
    api(project(":module06:module188:module4"))
    api(project(":module06:module217:module1"))
    api(project(":module06:module219:module4"))
    api(project(":module06:module242:module2"))
    api(project(":module06:module248:module2"))
    api(project(":module06:module278:module2"))
    api(project(":module07:module07:module5"))
    api(project(":module07:module56:module3"))
    api(project(":module07:module57:module4"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module02:module36:module4"))
    implementation(project(":module02:module42:module4"))
    implementation(project(":module03:module01:module1:module3"))
    implementation(project(":module04:module10:module1"))
    implementation(project(":module04:module10:module3"))
    implementation(project(":module04:module12:module3"))
    implementation(project(":module05:module01:module14:module3"))
    implementation(project(":module06:module006:module2"))
    implementation(project(":module06:module004:module3"))
    implementation(project(":module06:module007:module4"))
    implementation(project(":module06:module017:module7"))
    implementation(project(":module06:module054:module5"))
    implementation(project(":module06:module063:module5"))
    implementation(project(":module06:module075:module3"))
    implementation(project(":module06:module083:module08"))
    implementation(project(":module06:module094:module2"))
    implementation(project(":module06:module103:module2:module5"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module112:module4"))
    implementation(project(":module06:module140:module7"))
    implementation(project(":module06:module141:module1:module08"))
    implementation(project(":module06:module156:module2"))
    implementation(project(":module06:module171:module3"))
    implementation(project(":module06:module170:module3"))
    implementation(project(":module06:module188:module4"))
    implementation(project(":module06:module217:module1"))
    implementation(project(":module06:module219:module4"))
    implementation(project(":module06:module242:module2"))
    implementation(project(":module06:module248:module2"))
    implementation(project(":module06:module278:module2"))
    implementation(project(":module07:module07:module5"))
    implementation(project(":module07:module56:module3"))
    implementation(project(":module07:module57:module4"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module03.module01.module1.module2"
}