plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module01:module27"))
    api(project(":module01:module28"))
    api(project(":module04:module04:module2"))
    api(project(":module04:module10:module6"))
    api(project(":module04:module12:module6"))
    api(project(":module04:module14"))
    api(project(":module04:module20"))
    api(project(":module04:module22"))
    api(project(":module06:module090:module3"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module27"))
    implementation(project(":module01:module28"))
    implementation(project(":module04:module03:module3"))
    implementation(project(":module04:module04:module2"))
    implementation(project(":module04:module06"))
    implementation(project(":module04:module10:module6"))
    implementation(project(":module04:module12:module6"))
    implementation(project(":module04:module14"))
    implementation(project(":module04:module17:module6"))
    implementation(project(":module04:module20"))
    implementation(project(":module04:module22"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module270"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module07:module1"))
    implementation(project(":module15:module62:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module04:module05"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module127"
}
