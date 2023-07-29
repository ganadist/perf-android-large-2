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
    api(project(":module01:module40"))
    api(project(":module06:module071:module5"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module322:module1"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module340:module3"))
    api(project(":module06:module353:module1"))
    api(project(":module07:module87:module3"))
    api(project(":module15:module36:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module38"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module071:module5"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module202:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module268"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module351:module1"))
    implementation(project(":module06:module354:module2"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module07:module87:module3"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module337:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module355:module4"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module87.module1"
}