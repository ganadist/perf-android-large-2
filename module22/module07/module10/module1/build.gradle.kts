plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module05:module01:module09:module3"))
    api(project(":module22:module07:module10:module3"))
    api(project(":module22:module07:module33:module1"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module40"))
    implementation(project(":module05:module01:module07:module3"))
    implementation(project(":module05:module01:module06:module3"))
    implementation(project(":module05:module01:module09:module3"))
    implementation(project(":module05:module01:module08:module3"))
    implementation(project(":module05:module01:module10:module5"))
    implementation(project(":module05:module09:module3"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module22:module07:module04:module3"))
    implementation(project(":module22:module07:module06:module2"))
    implementation(project(":module22:module07:module10:module3"))
    implementation(project(":module22:module07:module13"))
    implementation(project(":module22:module07:module11:module3"))
    implementation(project(":module22:module07:module33:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module10.module1"
}
