plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    androidTestImplementation(project(":module22:module04:module15:module6"))
    api(project(":module01:module07"))
    api(project(":module01:module22"))
    api(project(":module05:module07:module4"))
    api(project(":module06:module047:module4"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module148:module3"))
    api(project(":module06:module258:module4"))
    api(project(":module06:module289"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module313:module5"))
    api(project(":module06:module326"))
    api(project(":module15:module27:module1"))
    api(project(":module22:module04:module15:module5"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module01:module07"))
    implementation(project(":module01:module22"))
    implementation(project(":module05:module07:module4"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module047:module4"))
    implementation(project(":module06:module044:module2"))
    implementation(project(":module06:module080:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module148:module3"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module234:module2"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module289"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module343"))
    implementation(project(":module15:module27:module1"))
    implementation(project(":module22:module04:module15:module5"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module081"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module04.module15.module2"
}
