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
    api(project(":module06:module249:module5"))
    api(project(":module06:module348"))
    api("javax.inject:javax.inject:1")
    implementation(project(":module01:module06"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module151"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module249:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module348"))
    implementation("javax.inject:javax.inject:1")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module158"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.burst:burst-junit4:1.1.1")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module249.module1"
}
