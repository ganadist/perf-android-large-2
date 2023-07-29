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
    api(project(":module06:module207"))
    api(project(":module06:module210:module1"))
    api(project(":module06:module267:module1"))
    api("androidx.core:core-ktx:1.2.0")
    api("androidx.recyclerview:recyclerview:1.0.0")
    api("ca.barrenechea.header-decor:header-decor:0.2.8")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module207"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module267:module1"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("ca.barrenechea.header-decor:header-decor:0.2.8")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module211.module1"
}
