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
    implementation(project(":module06:module207"))
    implementation(project(":module06:module343"))
    implementation(project(":module06:module348"))
    implementation(project(":module18:module3:module4"))
    implementation(project(":module18:module3:module6"))
    implementation(project(":module18:module3:module9"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module3.module7"
}