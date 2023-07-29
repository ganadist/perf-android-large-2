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
    api(project(":module06:module156:module3"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module018"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module01:module32"))
    testImplementation(project(":module06:module094:module3"))
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module01"
}
