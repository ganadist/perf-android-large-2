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
    api(project(":module02:module13:module3"))
    api(project(":module02:module14:module5"))
    api(project(":module02:module15:module5"))
    api(project(":module02:module16:module5"))
    api(project(":module02:module37:module31"))
    api(project(":module02:module37:module34"))
    api(project(":module02:module37:module35"))
    api(project(":module02:module42:module5"))
    api(project(":module06:module017:module8"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module207"))
    api(project(":module06:module243"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module322:module1"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module353:module1"))
    api("com.google.android.material:material:1.1.0")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-rx2:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module13:module3"))
    implementation(project(":module02:module14:module5"))
    implementation(project(":module02:module15:module5"))
    implementation(project(":module02:module16:module5"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module34"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module02:module42:module5"))
    implementation(project(":module06:module017:module8"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module353:module1"))
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module02:module37:module05:module4"))
    testImplementation(project(":module02:module37:module26:module4"))
    testImplementation(project(":module02:module37:module28:module4"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module324:module1"))
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
    namespace = "pkg.android.module02.module16.module2"
}
