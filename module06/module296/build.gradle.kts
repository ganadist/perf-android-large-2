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
    api(project(":module06:module295:module6"))
    api(project(":module06:module342:module3"))
    api("com.squareup.wire:wire-gson-support:3.0.0")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module07:module1"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module15:module41:module1"))
    implementation(project(":module15:module65:module1"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.wire:wire-gson-support:3.0.0")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module06:module351:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module296"
}
