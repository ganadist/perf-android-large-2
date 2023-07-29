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
    api(project(":module06:module090:module3"))
    api(project(":module06:module294:module1"))
    api("org.mockito:mockito-core:2.28.2")
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module294:module1"))
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module092"
}
