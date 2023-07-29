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
    api(project(":module06:module097:module6"))
    api(project(":module06:module357"))
    api(project(":module15:module56:module1"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module357"))
    implementation(project(":module15:module56:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module358"
}
