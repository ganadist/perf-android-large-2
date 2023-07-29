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
    api(project(":module06:module335:module1"))
    api(project(":module09:module6"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module335:module1"))
    implementation(project(":module09:module6"))
    implementation(project(":module22:module04:module11"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module04.module12"
}