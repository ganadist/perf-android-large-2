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
    api(project(":module06:module005:module4"))
    api(project(":module06:module023"))
    api(project(":module06:module333:module5"))
    api("com.evernote:android-job:1.4.1")
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module22"))
    implementation(project(":module01:module35"))
    implementation(project(":module06:module005:module4"))
    implementation(project(":module06:module023"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module212"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module07:module08:module8"))
    implementation("com.evernote:android-job:1.4.1")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module005:module5"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module005.module1"
}
