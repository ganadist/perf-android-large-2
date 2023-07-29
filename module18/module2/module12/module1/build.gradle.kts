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
    api(project(":module18:module2:module12:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module06"))
    implementation(project(":module01:module24"))
    implementation(project(":module01:module38"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module098"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module326"))
    implementation(project(":module18:module2:module12:module3"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module12.module1"
}
