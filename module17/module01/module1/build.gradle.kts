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
    api(project(":module17:module01:module3"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module010:module1"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module095"))
    implementation(project(":module06:module096:module5"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module17:module01:module3"))
    implementation(project(":module17:module13:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.okhttp3:okhttp:4.5.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module17.module01.module1"
}