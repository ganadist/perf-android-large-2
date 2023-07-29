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
    api(project(":module05:module03:module2"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module084"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module254"))
    api(project(":module06:module276:module1"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module353:module1"))
    api(project(":module15:module21:module1"))
    api(project(":module15:module65:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module03:module2"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module15:module65:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module01.module15.module4"
}
