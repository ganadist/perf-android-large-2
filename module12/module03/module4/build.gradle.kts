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
    api(project(":module12:module03:module7"))
    api(project(":module12:module18"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module077"))
    implementation(project(":module06:module100:module4"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module243"))
    implementation(project(":module07:module40"))
    implementation(project(":module07:module42:module4"))
    implementation(project(":module12:module03:module7"))
    implementation(project(":module12:module04"))
    implementation(project(":module12:module18"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module31:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module12.module03.module4"
}
