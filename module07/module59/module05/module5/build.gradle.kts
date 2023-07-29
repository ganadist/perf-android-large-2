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
    api(project(":module06:module134:module7"))
    api(project(":module06:module353:module1"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module07:module59:module01:module1"))
    implementation(project(":module07:module59:module06:module4"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module59.module05.module5"
}
