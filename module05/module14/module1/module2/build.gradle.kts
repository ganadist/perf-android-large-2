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
    api(project(":module05:module14:module1:module4"))
    api(project(":module06:module336:module1"))
    api(libs.kotlin.stdlib)
    implementation(project(":module05:module14:module1:module1"))
    implementation(project(":module05:module14:module1:module4"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module14.module1.module2"
}
