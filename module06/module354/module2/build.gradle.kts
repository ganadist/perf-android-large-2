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
    api(project(":module06:module355:module3"))
    api(project(":module06:module353:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module084"))
    implementation(project(":module06:module202:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module202:module2"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module354.module2"
}
