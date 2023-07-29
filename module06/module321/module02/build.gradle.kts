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
    api(project(":module06:module109:module1"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module321:module11"))
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("junit:junit:4.13")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module321:module01"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module321:module11"))
    implementation(project(":module06:module335:module1"))
    implementation("androidx.test:rules:1.1.0")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("junit:junit:4.13")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module321.module02"
}
