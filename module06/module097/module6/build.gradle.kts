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
    api(project(":module01:module08"))
    api(project(":module06:module011"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module110"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module348"))
    api(project(":module15:module56:module1"))
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module08"))
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module011"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module103:module2:module6"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module348"))
    implementation(project(":module15:module56:module1"))
    implementation("com.googlecode.libphonenumber:libphonenumber:8.11.5")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module097:module7"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module097.module6"
}
