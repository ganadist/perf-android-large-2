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
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module207"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module46.module1"
}
