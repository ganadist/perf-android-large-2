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
    api(project(":module06:module004:module2"))
    api(project(":module06:module084"))
    api(project(":module06:module121:module3"))
    api("com.squareup.okhttp3:okhttp:4.5.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module004:module2"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module121:module3"))
    implementation(project(":module06:module339:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.okhttp3:okhttp:4.5.0")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module018"
}
