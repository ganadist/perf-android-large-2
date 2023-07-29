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
    api(project(":module01:module39"))
    api(project(":module06:module192"))
    api(project(":module06:module298:module1"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module359"))
    api(project(":module22:module01:module32"))
    api(project(":module22:module01:module45"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module39"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module359"))
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module01:module45"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module33"
}
