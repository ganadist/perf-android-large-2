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
    api(project(":module06:module153:module4"))
    api(project(":module06:module348"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module13"))
    implementation(project(":module06:module042:module5"))
    implementation(project(":module06:module153:module4"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module350:module1"))
    implementation(project(":module10"))
    implementation(project(":module15:module21:module1"))
    implementation("com.commit451:PhotoView:1.2.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module153.module1"
}
