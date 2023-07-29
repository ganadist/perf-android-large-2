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
    api(project(":module06:module243"))
    api(project(":module06:module333:module5"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module192"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module359"))
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module334.module2"
}