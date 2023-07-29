plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module109:module1"))
    api(project(":module06:module147:module2"))
    api(project(":module06:module147:module6"))
    api("com.google.dagger:dagger:2.28")
    api("com.google.firebase:firebase-common:19.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module147:module2"))
    implementation(project(":module06:module147:module6"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.google.firebase:firebase-common:19.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module147.module1"
}
