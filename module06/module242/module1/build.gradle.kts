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
    api(project(":module06:module084"))
    api(project(":module06:module224:module6"))
    api(project(":module06:module242:module3"))
    api(project(":module06:module278:module7"))
    api(project(":module06:module333:module5"))
    api(project(":module06:module345"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module084"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module242:module3"))
    implementation(project(":module06:module278:module7"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module334:module2"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module345"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module242.module1"
}