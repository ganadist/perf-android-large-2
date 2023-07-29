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
    api(project(":module06:module006:module3"))
    api(project(":module06:module004:module4"))
    api(project(":module06:module009:module6"))
    api(project(":module06:module015:module5"))
    api(project(":module06:module020:module5"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module120:module4"))
    api(project(":module06:module119:module9"))
    api(project(":module06:module121:module3"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module295:module6"))
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module006:module3"))
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module009:module6"))
    implementation(project(":module06:module015:module5"))
    implementation(project(":module06:module020:module5"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module120:module4"))
    implementation(project(":module06:module119:module9"))
    implementation(project(":module06:module121:module3"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module337:module3"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module120.module1"
}