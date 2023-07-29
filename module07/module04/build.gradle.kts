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
    api(project(":module15:module36:module1"))
    implementation(project(":module01:module03:module1"))
    implementation(project(":module01:module22"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module15:module36:module1"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module193"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
}

android {
    namespace = "pkg.android.module07.module04"
}