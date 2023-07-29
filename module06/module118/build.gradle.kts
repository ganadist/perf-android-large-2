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
    api(project(":module06:module156:module3"))
    api(project(":module06:module255"))
    api(project(":module06:module297:module5"))
    api(project(":module06:module326"))
    api("com.squareup.burst:burst-junit4:1.1.1")
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module255"))
    implementation(project(":module06:module297:module5"))
    implementation(project(":module06:module326"))
    implementation("com.squareup.burst:burst-junit4:1.1.1")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module118"
}