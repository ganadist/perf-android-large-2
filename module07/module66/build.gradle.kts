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
    api(project(":module01:module24"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module267:module1"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module24"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module053"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module093:module3"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module177"))
    implementation(project(":module06:module186"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module07:module03:module4"))
    implementation(project(":module07:module60"))
    implementation(project(":module07:module67:module1"))
    implementation(project(":module07:module67:module4"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module185:module9"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module66"
}
