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
    api(project(":module06:module013:module6"))
    api(project(":module06:module067"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module207"))
    api(project(":module06:module228:module3"))
    api(project(":module06:module276:module1"))
    api(project(":module06:module353:module1"))
    api(project(":module07:module39:module2:module5"))
    api(project(":module15:module36:module1"))
    api(project(":module18:module1:module02:module1"))
    api(project(":module18:module1:module06:module1"))
    api(project(":module18:module1:module13:module1"))
    api(project(":module18:module1:module19:module4"))
    api(project(":module18:module1:module20:module4"))
    api(project(":module18:module1:module24:module3"))
    api(project(":module18:module1:module25:module1"))
    api(project(":module18:module1:module27:module5"))
    api(project(":module18:module2:module23:module4"))
    api(project(":module18:module2:module26:module4"))
    api(project(":module18:module3:module1"))
    api(project(":module18:module3:module4"))
    api(project(":module18:module3:module8"))
    api(project(":module18:module3:module9"))
    api("com.squareup.coordinators:coordinators:0.5")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-rx2:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module228:module3"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module07:module39:module2:module5"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module18:module1:module02:module1"))
    implementation(project(":module18:module1:module06:module1"))
    implementation(project(":module18:module1:module13:module1"))
    implementation(project(":module18:module1:module19:module4"))
    implementation(project(":module18:module1:module20:module4"))
    implementation(project(":module18:module1:module24:module3"))
    implementation(project(":module18:module1:module25:module1"))
    implementation(project(":module18:module1:module27:module5"))
    implementation(project(":module18:module2:module23:module4"))
    implementation(project(":module18:module2:module26:module4"))
    implementation(project(":module18:module3:module1"))
    implementation(project(":module18:module3:module4"))
    implementation(project(":module18:module3:module8"))
    implementation(project(":module18:module3:module9"))
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module39:module2:module1"))
    testImplementation(project(":module18:module1:module07:module1"))
    testImplementation(project(":module18:module1:module19:module1"))
    testImplementation(project(":module18:module1:module20:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module2.module26.module1"
}