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
    api(project(":module06:module002:module3"))
    api(project(":module06:module005:module3"))
    api(project(":module06:module039:module5"))
    api(project(":module06:module061:module4"))
    api(project(":module06:module070:module3"))
    api(project(":module06:module072:module4"))
    api(project(":module06:module090:module2"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module145:module4"))
    api(project(":module06:module147:module4:module4"))
    api(project(":module06:module187:module3"))
    api(project(":module06:module185:module7"))
    api(project(":module06:module220:module3"))
    api(project(":module06:module284:module3"))
    api(project(":module06:module313:module3"))
    api(project(":module06:module313:module4"))
    api(project(":module07:module36"))
    api(project(":module07:module75"))
    api(project(":module07:module77:module4"))
    api(project(":module10"))
    api(project(":module14:module1"))
    api(project(":module22:module01:module01:module3"))
    api(project(":module22:module01:module04:module2"))
    api(project(":module22:module01:module05:module2"))
    api(project(":module22:module01:module06:module2"))
    api(project(":module22:module01:module07:module2"))
    api(project(":module22:module01:module09:module3"))
    api(project(":module22:module01:module09:module4"))
    api(project(":module22:module01:module22:module1"))
    api(project(":module22:module01:module25"))
    api(project(":module22:module01:module26"))
    api(project(":module22:module01:module28:module2"))
    api(project(":module22:module01:module35"))
    api(project(":module22:module04:module05"))
    api(project(":module22:module04:module09"))
    api("com.google.dagger:dagger:2.28")
    implementation(project(":module06:module002:module3"))
    implementation(project(":module06:module005:module3"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module061:module4"))
    implementation(project(":module06:module070:module3"))
    implementation(project(":module06:module072:module4"))
    implementation(project(":module06:module090:module2"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module145:module4"))
    implementation(project(":module06:module147:module4:module4"))
    implementation(project(":module06:module187:module3"))
    implementation(project(":module06:module185:module7"))
    implementation(project(":module06:module220:module3"))
    implementation(project(":module06:module284:module3"))
    implementation(project(":module06:module313:module3"))
    implementation(project(":module06:module313:module4"))
    implementation(project(":module07:module36"))
    implementation(project(":module07:module75"))
    implementation(project(":module07:module77:module4"))
    implementation(project(":module10"))
    implementation(project(":module14:module1"))
    implementation(project(":module22:module01:module01:module3"))
    implementation(project(":module22:module01:module04:module2"))
    implementation(project(":module22:module01:module05:module2"))
    implementation(project(":module22:module01:module06:module2"))
    implementation(project(":module22:module01:module07:module2"))
    implementation(project(":module22:module01:module09:module3"))
    implementation(project(":module22:module01:module09:module4"))
    implementation(project(":module22:module01:module22:module1"))
    implementation(project(":module22:module01:module25"))
    implementation(project(":module22:module01:module26"))
    implementation(project(":module22:module01:module28:module2"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module04:module05"))
    implementation(project(":module22:module04:module09"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module04.module01"
}
