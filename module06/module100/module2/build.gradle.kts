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
    api(project(":module01:module38"))
    api(project(":module06:module100:module4"))
    api(project(":module06:module097:module6"))
    api(project(":module06:module267:module1"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module38"))
    implementation(project(":module06:module012:module5"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module100:module4"))
    implementation(project(":module06:module101:module3"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module180:module5"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module287:module3"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module355:module3"))
    implementation("com.googlecode.libphonenumber:libphonenumber:8.11.5")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module097:module7"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module355:module4"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module100.module2"
}