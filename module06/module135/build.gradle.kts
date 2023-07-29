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
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(project(":module01:module36"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module163:module5"))
    implementation(project(":module06:module230:module2"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module346"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module135"
}