plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module02:module10:module4"))
    api(project(":module06:module017:module8"))
    api(project(":module06:module243"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module10:module4"))
    implementation(project(":module06:module017:module8"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module208:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module353:module2"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module10.module1"
}
