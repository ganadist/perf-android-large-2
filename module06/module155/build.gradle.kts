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
    api(project(":module06:module318:module5"))
    api(project(":module06:module340:module3"))
    api("androidx.annotation:annotation:1.1.0")
    api("androidx.appcompat:appcompat:1.1.0")
    implementation(project(":module06:module318:module5"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("javax.xml.bind:jaxb-api:2.1")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module155"
}