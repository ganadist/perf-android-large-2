plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module02:module22:module4"))
    api(project(":module06:module088:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module09:module5"))
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module05"))
    implementation(project(":module01:module23"))
    implementation(project(":module02:module01:module1"))
    implementation(project(":module02:module10:module4"))
    implementation(project(":module02:module22:module4"))
    implementation(project(":module02:module37:module04:module3"))
    implementation(project(":module02:module37:module28:module3"))
    implementation(project(":module02:module38:module3"))
    implementation(project(":module02:module42:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module088:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module153:module4"))
    implementation(project(":module06:module300"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module07:module36"))
    implementation(project(":module09:module5"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module02:module39"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module02.module40"
}
