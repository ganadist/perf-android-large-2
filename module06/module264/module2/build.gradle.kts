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
    api(project(":module01:module22"))
    api(project(":module01:module35"))
    api(project(":module06:module017:module8"))
    api(project(":module06:module264:module7"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module331"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module22"))
    implementation(project(":module01:module35"))
    implementation(project(":module06:module017:module8"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module264:module7"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module331"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module262:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module264.module2"
}
