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
    api(project(":module05:module14:module1:module4"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module14:module1:module4"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module124"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module202:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module231"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module306:module5"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module354:module2"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module013:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module05.module14.module1.module1"
}
