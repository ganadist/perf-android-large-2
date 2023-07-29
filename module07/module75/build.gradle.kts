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
    api(project(":module01:module30"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module06"))
    implementation(project(":module01:module30"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module342:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module313:module6"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module75"
}
