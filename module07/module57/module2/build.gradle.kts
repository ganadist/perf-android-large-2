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
    api(project(":module06:module070:module5"))
    api(project(":module06:module072:module5"))
    api(project(":module06:module220:module5"))
    api(project(":module06:module221:module4"))
    api(project(":module06:module223:module3"))
    api(project(":module06:module219:module6"))
    api(project(":module06:module259:module4"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module326"))
    api(project(":module07:module27:module1"))
    api(project(":module07:module57:module7"))
    api(project(":module15:module19:module1"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module10:module1"))
    implementation(project(":module06:module070:module5"))
    implementation(project(":module06:module072:module5"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module220:module5"))
    implementation(project(":module06:module221:module4"))
    implementation(project(":module06:module222:module1"))
    implementation(project(":module06:module223:module3"))
    implementation(project(":module06:module219:module6"))
    implementation(project(":module06:module259:module4"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module07:module27:module1"))
    implementation(project(":module07:module57:module7"))
    implementation(project(":module15:module19:module1"))
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module219:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
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
    namespace = "pkg.android.module07.module57.module2"
}
