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
    api(project(":module01:module40"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module141:module1:module13"))
    api(project(":module06:module353:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module35"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module141:module1:module13"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module257:module3"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module355:module3"))
    implementation(project(":module06:module353:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
}

android {
    namespace = "pkg.android.module06.module141.module1.module04"
}
