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
    api(project(":module06:module086:module1"))
    api(project(":module06:module353:module1"))
    api(project(":module18:module2:module32:module4"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module18:module1:module12:module3"))
    implementation(project(":module18:module2:module32:module4"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module067"))
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module134:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module18.module2.module32.module1"
}
