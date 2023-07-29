plugins{
  id("com.android.application")
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
    androidTestImplementation(project(":module03:module03:module1:module1"))
    androidTestImplementation(project(":module05:module01:module14:module2"))
    androidTestImplementation(project(":module05:module01:module15:module2"))
    androidTestImplementation(project(":module05:module10:module10"))
    androidTestImplementation(project(":module06:module044:module1"))
    androidTestImplementation(project(":module06:module122:module2"))
    androidTestImplementation(project(":module06:module143:module4"))
    androidTestImplementation(project(":module06:module232"))
    androidTestImplementation(project(":module06:module240"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module08:module3"))
    androidTestImplementation(project(":module07:module22:module1"))
    androidTestImplementation(project(":module07:module84"))
    androidTestImplementation(project(":module09:module6"))
    androidTestImplementation(project(":module11"))
    androidTestImplementation(project(":module15:module23:module1"))
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("com.google.truth:truth:1.0")
    androidTestImplementation("junit:junit:4.13")
    compileOnly(project(":module01:module05"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module16:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module16.module5"
}