plugins{
  id("com.android.library")
}
android {
    compileSdk = 29
    defaultConfig {
        minSdk = 25
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    
}
dependencies {
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module04:module18:module4"))
    api(project(":module06:module039:module5"))
    api(project(":module06:module041:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module129:module3"))
    api(project(":module06:module145:module4"))
    api(project(":module06:module185:module7"))
    api(project(":module06:module224:module5"))
    api(project(":module06:module264:module6"))
    api(project(":module06:module284:module3"))
    api(project(":module06:module313:module3"))
    api(project(":module06:module314:module4"))
    api(project(":module10"))
    api(project(":module14:module1"))
    api(project(":module22:module01:module01:module3"))
    api(project(":module22:module01:module04:module2"))
    api(project(":module22:module01:module05:module2"))
    api(project(":module22:module01:module06:module2"))
    api(project(":module22:module01:module07:module2"))
    api(project(":module22:module01:module09:module6"))
    api(project(":module22:module01:module11"))
    api(project(":module22:module01:module22:module2"))
    api(project(":module22:module01:module25"))
    api(project(":module22:module01:module28:module3"))
    api(project(":module22:module01:module35"))
    api(project(":module22:module07:module02:module4"))
    api(project(":module22:module07:module04:module2"))
    api(project(":module22:module07:module09:module3"))
    api(project(":module22:module07:module10:module2"))
    api(project(":module22:module07:module11:module2"))
    api(project(":module22:module07:module32"))
    api("com.google.dagger:dagger:2.28")
    implementation(project(":module04:module18:module4"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module041:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module129:module3"))
    implementation(project(":module06:module145:module4"))
    implementation(project(":module06:module185:module7"))
    implementation(project(":module06:module224:module5"))
    implementation(project(":module06:module264:module6"))
    implementation(project(":module06:module284:module3"))
    implementation(project(":module06:module313:module3"))
    implementation(project(":module06:module314:module4"))
    implementation(project(":module10"))
    implementation(project(":module14:module1"))
    implementation(project(":module22:module01:module01:module3"))
    implementation(project(":module22:module01:module04:module2"))
    implementation(project(":module22:module01:module05:module2"))
    implementation(project(":module22:module01:module06:module2"))
    implementation(project(":module22:module01:module07:module2"))
    implementation(project(":module22:module01:module09:module6"))
    implementation(project(":module22:module01:module11"))
    implementation(project(":module22:module01:module22:module2"))
    implementation(project(":module22:module01:module25"))
    implementation(project(":module22:module01:module28:module3"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module07:module02:module4"))
    implementation(project(":module22:module07:module04:module2"))
    implementation(project(":module22:module07:module09:module3"))
    implementation(project(":module22:module07:module10:module2"))
    implementation(project(":module22:module07:module11:module2"))
    implementation(project(":module22:module07:module32"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module21"
}