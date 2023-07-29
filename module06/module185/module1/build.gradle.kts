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
    api(project(":module06:module093:module1"))
    api(project(":module06:module097:module1"))
    api(project(":module06:module185:module8"))
    api(project(":module06:module295:module1"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module093:module1"))
    implementation(project(":module06:module097:module1"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module295:module1"))
    implementation(project(":module15:module24:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module185.module1"
}
