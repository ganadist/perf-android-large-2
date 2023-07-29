plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module212"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module35"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module32"
}
