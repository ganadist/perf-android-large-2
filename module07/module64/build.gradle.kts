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
    api(project(":module01:module06"))
    api(project(":module01:module14"))
    api(project(":module01:module22"))
    api(project(":module04:module21:module3"))
    api(project(":module06:module109:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.workflow:workflow-rx2:0.23.2")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module06"))
    implementation(project(":module01:module14"))
    implementation(project(":module01:module22"))
    implementation(project(":module04:module11:module3"))
    implementation(project(":module04:module21:module3"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module126"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module343"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module07.module64"
}