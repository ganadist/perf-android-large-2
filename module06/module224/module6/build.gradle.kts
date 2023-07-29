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
    api(project(":module06:module084"))
    api("com.google.dagger:dagger:2.28")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module04:module20"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module124"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module342:module3"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module224.module6"
}
