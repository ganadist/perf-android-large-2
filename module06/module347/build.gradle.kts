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
    api(project(":module06:module155"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module345"))
    api("androidx.test.espresso:espresso-core:3.1.0")
    api("org.hamcrest:hamcrest-core:1.3")
    implementation(project(":module06:module155"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("org.hamcrest:hamcrest-core:1.3")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module347"
}