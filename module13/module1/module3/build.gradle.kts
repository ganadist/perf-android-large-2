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
    api(project(":module15:module50:module1"))
    api("com.dropbox.mobile.store:store4:4.0.0-alpha05")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation(project(":module15:module50:module1"))
    implementation("com.dropbox.mobile.store:store4:4.0.0-alpha05")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module13.module1.module3"
}