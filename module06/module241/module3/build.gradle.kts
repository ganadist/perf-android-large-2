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
    api(project(":module04:module14"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module155"))
    api(project(":module06:module240"))
    api(project(":module06:module353:module1"))
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module04:module14"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module240"))
    implementation(project(":module06:module353:module1"))
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module241.module3"
}
