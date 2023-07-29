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
    api(project(":module07:module12:module3"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module31"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module164:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module07:module12:module3"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module36:module1"))
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
}

android {
    namespace = "pkg.android.module07.module12.module1"
}