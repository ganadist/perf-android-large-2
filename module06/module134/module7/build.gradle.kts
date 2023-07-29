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
    api(project(":module06:module086:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module173:module1"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module296"))
    api(project(":module06:module297:module4"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module340:module3"))
    api(project(":module06:module342:module3"))
    api(project(":module15:module20:module1"))
    api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module136"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module20:module1"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module134:module1"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module134.module7"
}
