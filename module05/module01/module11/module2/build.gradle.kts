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
    api(project(":module05:module01:module11:module5"))
    api(project(":module06:module067"))
    api(project(":module06:module084"))
    api(project(":module06:module192"))
    api(project(":module06:module243"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module353:module1"))
    api(project(":module15:module36:module1"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module05:module01:module11:module5"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
}

android {
    namespace = "pkg.android.module05.module01.module11.module2"
}
