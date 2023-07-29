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
    api(project(":module07:module39:module3:module1"))
    api(project(":module07:module39:module3:module4"))
    api(project(":module15:module39:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module297:module1"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module07:module39:module3:module1"))
    implementation(project(":module07:module39:module3:module4"))
    implementation(project(":module15:module39:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module39.module3.module2"
}
