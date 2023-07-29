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
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module38:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module198:module1"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module295:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module15:module15:module1"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module39"
}
