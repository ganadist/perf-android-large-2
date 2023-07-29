plugins{
  id("com.android.application")
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
    implementation(project(":module22:module03:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module03.module1"
}
