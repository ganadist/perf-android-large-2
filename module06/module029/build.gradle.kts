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
    api(project(":module06:module342:module3"))
    implementation(project(":module06:module028"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module069"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module255"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module294:module4"))
    implementation(project(":module06:module297:module1"))
    implementation(project(":module06:module297:module5"))
    implementation(project(":module06:module295:module7"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module327:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module2"))
    implementation(project(":module15:module36:module1"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module192"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module330"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module06.module029"
}