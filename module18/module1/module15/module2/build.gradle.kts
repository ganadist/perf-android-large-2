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
    api(project(":module06:module067"))
    api(project(":module06:module077"))
    api(project(":module15:module21:module1"))
    api(project(":module18:module1:module18:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module067"))
    implementation(project(":module06:module077"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module18:module1:module18:module1"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module18:module1:module15:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module1.module15.module2"
}
