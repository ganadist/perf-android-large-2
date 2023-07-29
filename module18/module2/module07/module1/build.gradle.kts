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
    api(project(":module06:module180:module5"))
    api(project(":module06:module181:module5"))
    api(project(":module06:module224:module6"))
    api(project(":module06:module236:module6"))
    api(project(":module07:module39:module4:module5"))
    api(project(":module07:module59:module03:module1"))
    api(project(":module07:module59:module06:module4"))
    api(project(":module07:module59:module07:module4"))
    api(project(":module07:module59:module17:module3"))
    api(project(":module07:module59:module18:module1"))
    api(project(":module07:module59:module19:module1"))
    api(project(":module07:module69:module7"))
    api(project(":module18:module1:module05:module1"))
    api(project(":module18:module1:module11:module4"))
    api(project(":module18:module1:module23:module4"))
    api(project(":module18:module2:module07:module3"))
    api(project(":module18:module2:module12:module3"))
    api(project(":module18:module2:module21:module3"))
    api(project(":module18:module2:module24:module4"))
    api(project(":module18:module2:module25:module5"))
    api(project(":module18:module2:module29:module5"))
    api(project(":module18:module2:module35:module5"))
    api(project(":module18:module3:module2:module2"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module051"))
    implementation(project(":module06:module057"))
    implementation(project(":module06:module098"))
    implementation(project(":module06:module180:module5"))
    implementation(project(":module06:module181:module5"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module07:module39:module4:module5"))
    implementation(project(":module07:module59:module03:module1"))
    implementation(project(":module07:module59:module06:module4"))
    implementation(project(":module07:module59:module07:module4"))
    implementation(project(":module07:module59:module17:module3"))
    implementation(project(":module07:module59:module18:module1"))
    implementation(project(":module07:module59:module19:module1"))
    implementation(project(":module07:module69:module7"))
    implementation(project(":module18:module1:module05:module1"))
    implementation(project(":module18:module1:module11:module4"))
    implementation(project(":module18:module1:module23:module4"))
    implementation(project(":module18:module2:module07:module3"))
    implementation(project(":module18:module2:module12:module3"))
    implementation(project(":module18:module2:module21:module3"))
    implementation(project(":module18:module2:module24:module4"))
    implementation(project(":module18:module2:module25:module5"))
    implementation(project(":module18:module2:module29:module5"))
    implementation(project(":module18:module2:module35:module5"))
    implementation(project(":module18:module3:module2:module2"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module236:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module2.module07.module1"
}
