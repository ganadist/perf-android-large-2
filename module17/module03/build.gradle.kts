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
    api(project(":module17:module01:module2"))
    implementation(project(":module17:module01:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module17.module03"
}