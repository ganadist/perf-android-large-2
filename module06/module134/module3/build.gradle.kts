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
    api(project(":module01:module36"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module155"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module172:module5"))
    api(project(":module06:module243"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module36"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module172:module5"))
    implementation(project(":module06:module243"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module134:module1"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("androidx.test:core:1.1.0")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module134.module3"
}
