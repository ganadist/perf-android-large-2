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
    api(project(":module06:module149"))
    api(project(":module06:module345"))
    api(project(":module06:module348"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module151"
}