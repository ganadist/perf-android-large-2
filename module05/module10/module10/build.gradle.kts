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
    api(project(":module05:module10:module12"))
    api(project(":module06:module336:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module05:module10:module03"))
    implementation(project(":module05:module10:module12"))
    implementation(project(":module06:module008"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module108:module1:module1"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module332"))
    implementation(project(":module06:module334:module1"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module07:module63"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module05.module10.module10"
}