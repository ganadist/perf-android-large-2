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
    api(project(":module06:module136"))
    api(project(":module06:module340:module3"))
    api("com.nimbusds:nimbus-jose-jwt:3.10")
    implementation(project(":module06:module136"))
    implementation(project(":module06:module340:module3"))
    implementation("com.nimbusds:nimbus-jose-jwt:3.10")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module137"
}