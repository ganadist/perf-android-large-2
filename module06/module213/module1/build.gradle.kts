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
    api(project(":module06:module213:module5"))
    api(project(":module06:module214:module4"))
    api(project(":module06:module321:module10"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module213:module5"))
    implementation(project(":module06:module214:module4"))
    implementation(project(":module06:module321:module10"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module214:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module213.module1"
}