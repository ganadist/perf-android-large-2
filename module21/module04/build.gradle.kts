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
    api(project(":module03:module06:module1:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module14:module2"))
    api(project(":module21:module03"))
    api("com.google.dagger:dagger:2.28")
    compileOnly(project(":module01:module05"))
    compileOnly(project(":module05:module07:module4"))
    compileOnly(project(":module06:module022"))
    compileOnly(project(":module06:module100:module3"))
    compileOnly(project(":module06:module104"))
    compileOnly(project(":module06:module232"))
    compileOnly(project(":module06:module240"))
    compileOnly(project(":module06:module252"))
    compileOnly(project(":module06:module300"))
    compileOnly(project(":module06:module302"))
    compileOnly(project(":module07:module16"))
    compileOnly(project(":module07:module36"))
    compileOnly(project(":module07:module58"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module03:module06:module1:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module147:module3"))
    implementation(project(":module06:module183:module7"))
    implementation(project(":module07:module01"))
    implementation(project(":module14:module2"))
    implementation(project(":module21:module03"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module21.module04"
}
