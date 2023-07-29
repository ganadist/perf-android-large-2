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
    api(project(":module06:module002:module4"))
    api(project(":module06:module006:module2"))
    api(project(":module06:module009:module5"))
    api(project(":module06:module015:module2"))
    api(project(":module06:module025:module1"))
    api(project(":module06:module087:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module120:module3"))
    api(project(":module06:module119:module4"))
    api(project(":module06:module119:module9"))
    api(project(":module06:module121:module2"))
    api(project(":module06:module122:module3"))
    api(project(":module06:module123:module2"))
    api(project(":module06:module156:module2"))
    api(project(":module06:module161:module2"))
    api(project(":module06:module200:module1"))
    api(project(":module06:module238:module2"))
    api(project(":module06:module295:module3"))
    api(project(":module06:module295:module5"))
    api(project(":module06:module298:module2"))
    api(project(":module06:module314:module5"))
    api(project(":module06:module321:module03"))
    api(project(":module06:module321:module05"))
    api(project(":module06:module321:module07"))
    api(project(":module06:module321:module09"))
    api(project(":module06:module337:module2"))
    api(project(":module06:module340:module2"))
    api(project(":module06:module342:module2"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("com.squareup.okhttp3:logging-interceptor:4.5.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module002:module4"))
    implementation(project(":module06:module006:module2"))
    implementation(project(":module06:module009:module5"))
    implementation(project(":module06:module015:module2"))
    implementation(project(":module06:module025:module1"))
    implementation(project(":module06:module087:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module120:module3"))
    implementation(project(":module06:module119:module4"))
    implementation(project(":module06:module119:module9"))
    implementation(project(":module06:module121:module2"))
    implementation(project(":module06:module122:module3"))
    implementation(project(":module06:module123:module2"))
    implementation(project(":module06:module156:module2"))
    implementation(project(":module06:module161:module2"))
    implementation(project(":module06:module200:module1"))
    implementation(project(":module06:module238:module2"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module295:module3"))
    implementation(project(":module06:module295:module5"))
    implementation(project(":module06:module298:module2"))
    implementation(project(":module06:module314:module5"))
    implementation(project(":module06:module321:module03"))
    implementation(project(":module06:module321:module05"))
    implementation(project(":module06:module321:module07"))
    implementation(project(":module06:module321:module09"))
    implementation(project(":module06:module337:module2"))
    implementation(project(":module06:module340:module2"))
    implementation(project(":module06:module342:module2"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module119.module8"
}
