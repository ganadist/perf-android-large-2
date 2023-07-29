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
    api(project(":module06:module010:module1"))
    api(project(":module06:module212"))
    api(project(":module06:module339:module1"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.timber:timber:4.6.1")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module010:module1"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module212"))
    implementation(project(":module06:module339:module1"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module152"
}
