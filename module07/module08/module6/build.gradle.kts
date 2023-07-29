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
    api(project(":module07:module08:module8"))
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module008"))
    implementation(project(":module06:module113:module6"))
    implementation(project(":module06:module164:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module310"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module347"))
    implementation(project(":module06:module349"))
    implementation(project(":module07:module08:module3"))
    implementation(project(":module07:module08:module8"))
    implementation(project(":module07:module09:module2"))
    implementation(project(":module07:module10:module3"))
    implementation(project(":module07:module15:module8"))
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module08.module6"
}
