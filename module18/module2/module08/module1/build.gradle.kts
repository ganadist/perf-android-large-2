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
    api(project(":module18:module2:module08:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module01"))
    implementation(project(":module01:module14"))
    implementation(project(":module01:module22"))
    implementation(project(":module01:module25"))
    implementation(project(":module01:module31"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module243"))
    implementation(project(":module07:module62"))
    implementation(project(":module18:module1:module23:module4"))
    implementation(project(":module18:module2:module08:module3"))
    implementation(project(":module18:module2:module07:module3"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module08.module1"
}
