plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module01:module39"))
    api(project(":module06:module072:module5"))
    api(project(":module06:module116"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module214:module4"))
    api(project(":module06:module227:module3"))
    api(project(":module06:module228:module3"))
    api(project(":module06:module229:module1"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module342:module3"))
    api(project(":module15:module19:module1"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module06"))
    implementation(project(":module01:module16"))
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module033:module3"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module053"))
    implementation(project(":module06:module072:module5"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module214:module4"))
    implementation(project(":module06:module227:module3"))
    implementation(project(":module06:module228:module3"))
    implementation(project(":module06:module229:module1"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module15:module19:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module029"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module228:module4"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module257:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module297:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module07.module62"
}