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
    api(project(":module06:module321:module11"))
    api(project(":module06:module337:module4"))
    api(project(":module06:module340:module4"))
    api(project(":module06:module339:module1"))
    api("androidx.test:runner:1.1.0")
    api("com.google.truth:truth:1.0")
    api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("junit:junit:4.13")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    api("org.mockito:mockito-core:2.28.2")
    api("org.robolectric:robolectric:4.3")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module321:module11"))
    implementation(project(":module06:module337:module4"))
    implementation(project(":module06:module340:module4"))
    implementation(project(":module06:module339:module1"))
    implementation("androidx.test:runner:1.1.0")
    implementation("com.google.truth:truth:1.0")
    implementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("junit:junit:4.13")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.mockito:mockito-core:2.28.2")
    implementation("org.robolectric:robolectric:4.3")
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module06.module339.module2"
}
