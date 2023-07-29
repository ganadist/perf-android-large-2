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
    api(project(":module06:module097:module6"))
    api(project(":module06:module185:module8"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module326"))
    api(project(":module07:module03:module4"))
    api(project(":module07:module65:module4"))
    api(project(":module07:module67:module4"))
    api(project(":module15:module36:module1"))
    api(project(":module15:module56:module1"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module07:module03:module4"))
    implementation(project(":module07:module65:module4"))
    implementation(project(":module07:module67:module4"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module185:module9"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module67.module1"
}
