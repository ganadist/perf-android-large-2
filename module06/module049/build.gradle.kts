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
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module04:module16:module8"))
    api(project(":module06:module198:module1"))
    api(project(":module06:module339:module1"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module04:module03:module3"))
    implementation(project(":module04:module06"))
    implementation(project(":module04:module15"))
    implementation(project(":module04:module16:module8"))
    implementation(project(":module04:module17:module6"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module050"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module198:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module049"
}
