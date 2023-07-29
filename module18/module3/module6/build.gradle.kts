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
    implementation(project(":module06:module077"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module343"))
    implementation(project(":module06:module348"))
    implementation(project(":module18:module3:module9"))
    implementation(libs.kotlin.android.extensions)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module3.module6"
}
