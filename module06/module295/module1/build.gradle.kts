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
    api(project(":module06:module004:module4"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module296"))
    api(project(":module06:module295:module6"))
    api(project(":module15:module03:module1"))
    api(project(":module15:module05:module2"))
    api(project(":module15:module08:module1"))
    api(project(":module15:module14:module1"))
    api(project(":module15:module29:module1"))
    api(project(":module15:module40:module1"))
    api(project(":module15:module46:module1"))
    api(project(":module15:module53:module1"))
    api(project(":module15:module57:module1"))
    api(project(":module15:module58:module1"))
    api("com.squareup.retrofit2:retrofit-mock:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module296"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module15:module03:module1"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module08:module1"))
    implementation(project(":module15:module14:module1"))
    implementation(project(":module15:module29:module1"))
    implementation(project(":module15:module40:module1"))
    implementation(project(":module15:module46:module1"))
    implementation(project(":module15:module53:module1"))
    implementation(project(":module15:module57:module1"))
    implementation(project(":module15:module58:module1"))
    implementation("com.squareup.retrofit2:retrofit-mock:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module295.module1"
}
