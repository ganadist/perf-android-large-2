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
    api(project(":module01:module39"))
    api(project(":module01:module40"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module149"))
    api(project(":module06:module226"))
    api(project(":module06:module243"))
    api(project(":module06:module246"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module331"))
    api(project(":module06:module333:module5"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module345"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module246"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module10"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module09.module4"
}
