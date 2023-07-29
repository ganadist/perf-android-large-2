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
    api(project(":module06:module178:module6"))
    api("javax.inject:javax.inject:1")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module155"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module339:module1"))
    implementation("javax.inject:javax.inject:1")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module178.module3"
}