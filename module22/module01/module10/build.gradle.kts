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
    api(project(":module06:module109:module1"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module339:module1"))
    api("com.google.code.gson:gson:2.8.5")
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.timber:timber:4.6.1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module339:module1"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module36:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module01.module10"
}