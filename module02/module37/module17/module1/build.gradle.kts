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
    api(project(":module02:module37:module13:module1"))
    api("androidx.sqlite:sqlite:2.0.1")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module37:module13:module1"))
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module17.module1"
}
