plugins{
  id("com.android.library")
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
    
}
dependencies {
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module06:module109:module1"))
    api(project(":module08:module3"))
    api(project(":module14:module2"))
    api(project(":module22:module07:module21"))
    api("com.google.dagger:dagger:2.28")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module08:module3"))
    implementation(project(":module14:module2"))
    implementation(project(":module22:module07:module21"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module24"
}
