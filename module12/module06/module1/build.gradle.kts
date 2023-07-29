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
    api(project(":module01:module15"))
    api(project(":module06:module243"))
    api(project(":module07:module77:module7"))
    api(project(":module12:module06:module4"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module15"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module07:module08:module8"))
    implementation(project(":module07:module40"))
    implementation(project(":module07:module77:module7"))
    implementation(project(":module12:module04"))
    implementation(project(":module12:module05:module3"))
    implementation(project(":module12:module06:module4"))
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.squareup.workflow:legacy-workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module167"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module12.module06.module1"
}
