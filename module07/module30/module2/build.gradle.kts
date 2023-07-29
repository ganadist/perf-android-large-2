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
    api(project(":module01:module02"))
    api(project(":module01:module03:module1"))
    api(project(":module01:module05"))
    api(project(":module01:module10:module1"))
    api(project(":module06:module042:module5"))
    api(project(":module06:module070:module5"))
    api(project(":module06:module085"))
    api(project(":module06:module138:module3"))
    api(project(":module06:module166:module3"))
    api(project(":module06:module220:module5"))
    api(project(":module06:module221:module4"))
    api(project(":module06:module219:module6"))
    api(project(":module06:module243"))
    api(project(":module06:module247"))
    api(project(":module06:module254"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module334:module2"))
    api(project(":module06:module359"))
    api(project(":module07:module27:module1"))
    api(project(":module07:module28"))
    api(project(":module07:module29:module1"))
    api(project(":module07:module33:module1"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module02"))
    implementation(project(":module01:module03:module1"))
    implementation(project(":module01:module05"))
    implementation(project(":module01:module10:module1"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module042:module5"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module059:module1"))
    implementation(project(":module06:module058:module1"))
    implementation(project(":module06:module070:module5"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module138:module3"))
    implementation(project(":module06:module166:module3"))
    implementation(project(":module06:module168:module3"))
    implementation(project(":module06:module177"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module180:module5"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module220:module5"))
    implementation(project(":module06:module221:module4"))
    implementation(project(":module06:module219:module6"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module247"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module334:module2"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module06:module359"))
    implementation(project(":module07:module04"))
    implementation(project(":module07:module05:module5"))
    implementation(project(":module07:module06:module3"))
    implementation(project(":module07:module18:module3"))
    implementation(project(":module07:module23:module5"))
    implementation(project(":module07:module27:module1"))
    implementation(project(":module07:module28"))
    implementation(project(":module07:module29:module1"))
    implementation(project(":module07:module32:module5"))
    implementation(project(":module07:module33:module1"))
    implementation(project(":module07:module77:module7"))
    implementation(project(":module10"))
    implementation(project(":module15:module36:module1"))
    implementation("com.commit451:PhotoView:1.2.5")
    implementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module193"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module07.module30.module2"
}
