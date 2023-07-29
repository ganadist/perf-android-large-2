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
    api(project(":module06:module093:module3"))
    api(project(":module06:module295:module1"))
    api(project(":module15:module28:module1"))
    api("javax.inject:javax.inject:1")
    implementation(project(":module06:module093:module3"))
    implementation(project(":module06:module295:module1"))
    implementation(project(":module15:module28:module1"))
    implementation("javax.inject:javax.inject:1")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module093.module1"
}
