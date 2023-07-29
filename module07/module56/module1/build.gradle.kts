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
    api(project(":module06:module073:module7"))
    api(project(":module06:module220:module5"))
    api(project(":module06:module221:module4"))
    api(project(":module06:module219:module6"))
    api(project(":module06:module339:module1"))
    api(project(":module07:module56:module6"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module058:module1"))
    implementation(project(":module06:module070:module5"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module220:module5"))
    implementation(project(":module06:module221:module4"))
    implementation(project(":module06:module222:module1"))
    implementation(project(":module06:module223:module3"))
    implementation(project(":module06:module219:module6"))
    implementation(project(":module06:module259:module4"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module07:module56:module6"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module56.module1"
}
