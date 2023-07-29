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
    api(project(":module01:module39"))
    api(project(":module06:module192"))
    api(project(":module06:module315"))
    implementation(project(":module01:module39"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module315"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module45"
}