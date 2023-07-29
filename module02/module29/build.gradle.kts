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
    api(project(":module02:module30:module4"))
    api(project(":module02:module31:module4"))
    api(project(":module02:module32:module4"))
    api(project(":module02:module33:module4"))
    implementation(project(":module02:module30:module4"))
    implementation(project(":module02:module31:module4"))
    implementation(project(":module02:module32:module4"))
    implementation(project(":module02:module33:module4"))
    implementation(project(":module06:module243"))
    implementation(libs.kotlin.android.extensions)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module29"
}
