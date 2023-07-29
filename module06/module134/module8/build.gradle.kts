plugins{
  id("com.android.library")
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
    api(project(":module06:module134:module7"))
    api("org.mockito:mockito-core:2.28.2")
    implementation(project(":module06:module134:module7"))
    implementation("com.google.truth:truth:1.0")
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module134.module8"
}
