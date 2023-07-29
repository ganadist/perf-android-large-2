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
    implementation(project(":module06:module067"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module334:module1"))
    implementation(project(":module06:module333:module1"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module07:module63"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation("junit:junit:4.13")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module89"
}
