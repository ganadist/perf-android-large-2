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
    api(project(":module03:module02:module1:module1"))
    compileOnly(project(":module01:module05"))
    compileOnly(project(":module01:module08"))
    compileOnly(project(":module06:module030"))
    compileOnly(project(":module06:module100:module3"))
    compileOnly(project(":module06:module104"))
    compileOnly(project(":module06:module109:module1"))
    compileOnly(project(":module06:module232"))
    compileOnly(project(":module06:module240"))
    compileOnly(project(":module06:module252"))
    compileOnly(project(":module06:module300"))
    compileOnly(project(":module06:module302"))
    compileOnly(project(":module07:module16"))
    compileOnly(project(":module07:module36"))
    compileOnly(project(":module07:module58"))
    compileOnly(project(":module12:module01"))
    compileOnly(project(":module12:module04"))
    compileOnly(project(":module12:module05:module2"))
    compileOnly(project(":module12:module06:module3"))
    compileOnly(project(":module12:module11"))
    compileOnly(project(":module12:module14"))
    compileOnly(project(":module12:module15"))
    compileOnly(project(":module12:module16"))
    compileOnly(project(":module12:module17"))
    compileOnly(project(":module12:module18"))
    compileOnly(project(":module12:module20"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module03:module02:module1:module1"))
    implementation(project(":module06:module123:module2"))
    implementation(project(":module06:module147:module3"))
    implementation(project(":module07:module01"))
    implementation(project(":module12:module08"))
    implementation(project(":module12:module19"))
    implementation(project(":module14:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module12.module10"
}
