plugins{
  id("com.android.application")
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
    api(project(":module06:module345"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module289"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module20.module8"
}