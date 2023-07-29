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
    api(project(":module01:module10:module1"))
    api(project(":module06:module062:module3"))
    api(project(":module06:module072:module5"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module243"))
    api(project(":module06:module333:module5"))
    api(project(":module07:module27:module1"))
    api(project(":module07:module43:module3"))
    api(project(":module15:module19:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module10:module1"))
    implementation(project(":module01:module22"))
    implementation(project(":module06:module059:module1"))
    implementation(project(":module06:module062:module3"))
    implementation(project(":module06:module058:module1"))
    implementation(project(":module06:module072:module5"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module274:module7"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module350:module1"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module07:module27:module1"))
    implementation(project(":module07:module28"))
    implementation(project(":module07:module30:module2"))
    implementation(project(":module07:module32:module5"))
    implementation(project(":module07:module33:module1"))
    implementation(project(":module07:module43:module3"))
    implementation(project(":module07:module80:module3"))
    implementation(project(":module10"))
    implementation(project(":module15:module19:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module193"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module07.module43.module1"
}
