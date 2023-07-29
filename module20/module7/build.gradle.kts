plugins{
  id("com.android.application")
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
    
}
dependencies {
    api(project(":module06:module345"))
    api("androidx.appcompat:appcompat:1.1.0")
    implementation(project(":module06:module207"))
    implementation(project(":module06:module230:module2"))
    implementation(project(":module06:module345"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module20.module7"
}
