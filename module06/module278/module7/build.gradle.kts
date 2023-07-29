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
    api(project(":module01:module19"))
    api(project(":module01:module39"))
    api(project(":module06:module002:module5"))
    api(project(":module06:module084"))
    api(project(":module06:module143:module5"))
    api(project(":module06:module149"))
    api(project(":module06:module243"))
    api(project(":module06:module333:module5"))
    api(project(":module06:module339:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.inject:javax.inject:1")
    implementation(project(":module01:module19"))
    implementation(project(":module01:module39"))
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module339:module1"))
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module278.module7"
}
