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
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module06:module271"))
    api(project(":module06:module357"))
    api("com.google.dagger:dagger:2.28")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module271"))
    implementation(project(":module06:module357"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module07.module25"
}
