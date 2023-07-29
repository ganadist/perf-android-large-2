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
    api(project(":module06:module074:module8"))
    api(project(":module06:module075:module4"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module173:module1"))
    api(project(":module06:module298:module3"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module353:module1"))
    api(project(":module06:module353:module5"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.squareup.picasso:picasso:2.5.2")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup:pollexor:2.0.4")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module074:module8"))
    implementation(project(":module06:module075:module4"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module239:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module5"))
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup:pollexor:2.0.4")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module074:module2"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module074.module4"
}