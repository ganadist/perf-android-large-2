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
    api(project(":module02:module25:module3"))
    api(project(":module06:module106"))
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module25:module3"))
    implementation(project(":module02:module37:module21:module3"))
    implementation(project(":module02:module37:module23:module3"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module06:module106"))
    implementation(project(":module06:module342:module4"))
    implementation(project(":module06:module339:module2"))
    implementation(project(":module15:module21:module1"))
    implementation("com.google.truth:truth:1.0")
    implementation("javax.xml.bind:jaxb-api:2.1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module02.module25.module4"
}
