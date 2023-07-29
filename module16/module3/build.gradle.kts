plugins{
  id("com.android.application")
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
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    api(project(":module16:module4"))
    api("com.squareup.haha:haha:2.0.3")
    implementation(project(":module16:module4"))
    implementation("com.squareup.haha:haha:2.0.3")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module16.module3"
}
