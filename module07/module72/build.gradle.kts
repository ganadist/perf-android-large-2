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
    api(project(":module06:module109:module1"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module243"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module72"
}
