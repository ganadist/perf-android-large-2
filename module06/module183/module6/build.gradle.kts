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
    api(project(":module06:module183:module3"))
    api(project(":module06:module183:module7"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module183:module3"))
    implementation(project(":module06:module183:module7"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module321:module10"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module183.module6"
}
