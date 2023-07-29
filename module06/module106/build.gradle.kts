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
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module21:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module106"
}
