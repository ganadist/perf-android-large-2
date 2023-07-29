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
    api(project(":module06:module342:module3"))
    api("com.squareup.picasso:picasso:2.5.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module06:module342:module3"))
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module239.module1"
}
