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
    api(project(":module18:module2:module28:module4"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module343"))
    implementation(project(":module18:module2:module28:module1"))
    implementation(project(":module18:module2:module28:module4"))
    implementation(project(":module18:module3:module2:module1"))
    implementation(project(":module18:module3:module6"))
    implementation(project(":module18:module3:module7"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module18.module2.module28.module2"
}
