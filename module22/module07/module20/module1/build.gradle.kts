plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module22:module07:module20:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module22:module07:module20:module3"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module185:module9"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module355:module4"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module07.module20.module1"
}
