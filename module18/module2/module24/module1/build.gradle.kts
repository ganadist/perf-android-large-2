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
    api(project(":module18:module2:module24:module4"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module07:module59:module01:module1"))
    implementation(project(":module07:module59:module02:module3"))
    implementation(project(":module07:module59:module13:module3"))
    implementation(project(":module07:module59:module17:module3"))
    implementation(project(":module18:module1:module12:module3"))
    implementation(project(":module18:module1:module13:module1"))
    implementation(project(":module18:module1:module24:module3"))
    implementation(project(":module18:module1:module27:module5"))
    implementation(project(":module18:module2:module24:module4"))
    implementation(project(":module18:module2:module32:module4"))
    implementation(project(":module18:module2:module34:module4"))
    implementation(project(":module18:module3:module1"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module59:module05:module1"))
    testImplementation(project(":module18:module2:module34:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module2.module24.module1"
}
