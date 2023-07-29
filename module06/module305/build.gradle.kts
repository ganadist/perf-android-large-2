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
    api(project(":module06:module254"))
    api(project(":module06:module342:module3"))
    api("com.google.code.gson:gson:2.8.5")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module254"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module07:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.code.gson:gson:2.8.5")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.burst:burst-junit4:1.1.1")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module305"
}
