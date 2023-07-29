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
    api(project(":module05:module03:module2"))
    api(project(":module05:module11:module3"))
    api(project(":module05:module10:module08"))
    api(project(":module05:module10:module11"))
    api(project(":module05:module10:module12"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module067"))
    api(project(":module06:module163:module5"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module260"))
    api(project(":module06:module321:module10"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module05:module03:module2"))
    implementation(project(":module05:module11:module3"))
    implementation(project(":module05:module10:module08"))
    implementation(project(":module05:module10:module11"))
    implementation(project(":module05:module10:module12"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module163:module5"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module321:module10"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module10.module09"
}