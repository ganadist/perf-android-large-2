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
    annotationProcessor("com.uber.nullaway:nullaway:0.7.2")
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module22:module07:module04:module3"))
    implementation(project(":module22:module07:module03:module1"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module07.module33.module1"
}
