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
    api(project(":module06:module031:module2"))
    api(project(":module06:module122:module2"))
    api(project(":module06:module143:module4"))
    api(project(":module06:module161:module2"))
    api(project(":module06:module165:module2"))
    api(project(":module06:module182:module2"))
    api(project(":module06:module185:module6"))
    api(project(":module06:module318:module2"))
    api(project(":module06:module324:module3"))
    api(project(":module06:module335:module1"))
    api(project(":module08:module3"))
    api(project(":module10"))
    api(project(":module14:module1"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module031:module2"))
    implementation(project(":module06:module122:module2"))
    implementation(project(":module06:module143:module4"))
    implementation(project(":module06:module161:module2"))
    implementation(project(":module06:module165:module2"))
    implementation(project(":module06:module182:module2"))
    implementation(project(":module06:module185:module6"))
    implementation(project(":module06:module300"))
    implementation(project(":module06:module318:module2"))
    implementation(project(":module06:module324:module3"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module08:module3"))
    implementation(project(":module10"))
    implementation(project(":module14:module1"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module14.module2"
}