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
    api(project(":module06:module192"))
    api(project(":module06:module194"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module314:module1"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module345"))
    api(project(":module06:module359"))
    api("com.google.dagger:dagger:2.28")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module314:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module359"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module154"
}
