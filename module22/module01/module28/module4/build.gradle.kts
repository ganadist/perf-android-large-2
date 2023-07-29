plugins{
  id("com.android.library")
  id("kotlin-android")
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
                kotlinOptions {
    jvmTarget = "1.8"
}
            }
dependencies {
    api(project(":module01:module28"))
    api(project(":module01:module39"))
    api(project(":module06:module090:module3"))
    api(project(":module15:module21:module1"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module28"))
    implementation(project(":module01:module39"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module198:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module15:module21:module1"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module28.module4"
}