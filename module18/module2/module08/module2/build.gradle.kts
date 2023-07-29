plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
                kotlinOptions {
    jvmTarget = "1.8"
}
            }
dependencies {
    api(project(":module06:module077"))
    api(project(":module06:module100:module4"))
    api(project(":module06:module104"))
    api(project(":module06:module105"))
    api(project(":module06:module109:module1"))
    api(project(":module07:module59:module05:module4"))
    api(project(":module07:module59:module09:module4"))
    api(project(":module07:module69:module4"))
    api(project(":module07:module69:module5"))
    api(project(":module18:module1:module11:module3"))
    api(project(":module18:module1:module27:module4"))
    api(project(":module18:module2:module08:module1"))
    api(project(":module18:module2:module08:module3"))
    api(project(":module18:module2:module07:module2"))
    api(project(":module18:module2:module21:module2"))
    api(project(":module18:module2:module24:module3"))
    api(project(":module18:module2:module25:module4"))
    api(project(":module18:module2:module32:module3"))
    api(project(":module18:module2:module34:module3"))
    api(project(":module18:module2:module35:module4"))
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module077"))
    implementation(project(":module06:module100:module4"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module07:module59:module05:module4"))
    implementation(project(":module07:module59:module09:module4"))
    implementation(project(":module07:module69:module4"))
    implementation(project(":module07:module69:module5"))
    implementation(project(":module18:module1:module11:module3"))
    implementation(project(":module18:module1:module27:module4"))
    implementation(project(":module18:module2:module08:module1"))
    implementation(project(":module18:module2:module08:module3"))
    implementation(project(":module18:module2:module07:module2"))
    implementation(project(":module18:module2:module21:module2"))
    implementation(project(":module18:module2:module24:module3"))
    implementation(project(":module18:module2:module25:module4"))
    implementation(project(":module18:module2:module32:module3"))
    implementation(project(":module18:module2:module34:module3"))
    implementation(project(":module18:module2:module35:module4"))
    implementation("com.google.dagger:dagger:2.28")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module08.module2"
}
