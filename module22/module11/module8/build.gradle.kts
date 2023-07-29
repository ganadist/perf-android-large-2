plugins{
  id("com.android.library")
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
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module06:module243"))
    api(project(":module22:module07:module17"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module087:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module22:module07:module17"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module11.module8"
}
