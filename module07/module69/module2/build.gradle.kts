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
    api(project(":module06:module083:module09"))
    api(project(":module06:module144:module4"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module260"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module272"))
    api(project(":module06:module285:module5"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module298:module3"))
    api(project(":module06:module322:module1"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module353:module1"))
    api(project(":module07:module69:module7"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module064:module2"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module144:module4"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module272"))
    implementation(project(":module06:module277:module6"))
    implementation(project(":module06:module285:module5"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module343"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module07:module69:module7"))
    implementation(project(":module15:module04:module1"))
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module107:module1"))
    testImplementation(project(":module06:module107:module5"))
    testImplementation(project(":module06:module134:module1"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module351:module1"))
    testImplementation(project(":module06:module353:module2"))
    testImplementation("androidx.test:core:1.1.0")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module07.module69.module2"
}
