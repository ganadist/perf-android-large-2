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
    api(project(":module17:module04:module2"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module04:module03:module3"))
    implementation(project(":module04:module12:module6"))
    implementation(project(":module04:module14"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module17:module01:module3"))
    implementation(project(":module17:module02:module2"))
    implementation(project(":module17:module04:module2"))
    implementation(project(":module17:module12:module2:module1"))
    implementation(project(":module17:module13:module1"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module04:module06"))
    testImplementation(project(":module04:module14"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module17:module13:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module17.module04.module1"
}
