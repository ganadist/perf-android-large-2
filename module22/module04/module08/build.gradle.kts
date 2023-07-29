plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module109:module1"))
    api(project(":module06:module243"))
    api(project(":module06:module295:module6"))
    api(project(":module15:module49:module1"))
    api(project(":module22:module01:module04:module3"))
    api(project(":module22:module01:module28:module4"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module07:module45"))
    implementation(project(":module15:module49:module1"))
    implementation(project(":module22:module01:module04:module3"))
    implementation(project(":module22:module01:module28:module4"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module22.module04.module08"
}