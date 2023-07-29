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
    api(project(":module06:module030"))
    api(project(":module06:module048"))
    api(project(":module06:module050"))
    api(project(":module06:module127"))
    api(project(":module06:module153:module2"))
    api(project(":module06:module192"))
    api(project(":module06:module310"))
    api(project(":module06:module315"))
    api(project(":module06:module336:module1"))
    api(project(":module06:module347"))
    api(project(":module08:module2"))
    api(project(":module09:module5"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module017:module6"))
    implementation(project(":module06:module026:module7"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module050"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module113:module6"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module153:module2"))
    implementation(project(":module06:module153:module4"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module203:module1"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module310"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module08:module2"))
    implementation(project(":module07:module16"))
    implementation(project(":module07:module78"))
    implementation(project(":module09:module5"))
    implementation(project(":module10"))
    implementation("com.google.truth:truth:1.0")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module09.module6"
}