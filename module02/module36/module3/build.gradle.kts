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
    api(project(":module02:module36:module5"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module02:module36:module5"))
    implementation(project(":module02:module37:module07:module1"))
    implementation(project(":module02:module37:module18:module3"))
    implementation(project(":module02:module37:module25:module3"))
    implementation(project(":module06:module058:module1"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module275:module3"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module324:module4"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module02:module37:module11:module2"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module02.module36.module3"
}