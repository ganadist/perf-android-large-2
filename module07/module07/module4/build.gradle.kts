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
    api(project(":module06:module336:module1"))
    api(project(":module07:module07:module6"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module195"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module07:module07:module3"))
    implementation(project(":module07:module07:module6"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module07.module4"
}