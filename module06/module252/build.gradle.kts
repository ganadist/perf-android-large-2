plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module042:module5"))
    api(project(":module15:module56:module1"))
    implementation(project(":module06:module042:module5"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module146"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module192"))
    implementation(project(":module15:module56:module1"))
    implementation("com.google.android.material:material:1.1.0")
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module252"
}
