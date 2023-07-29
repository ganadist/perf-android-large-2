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
    api(project(":module01:module16"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module067"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module157"))
    api(project(":module06:module182:module5"))
    api(project(":module06:module326"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module01:module16"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module182:module5"))
    implementation(project(":module06:module326"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module250.module4"
}
