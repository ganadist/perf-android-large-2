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
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module01"))
    implementation(project(":module01:module25"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module057"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module224:module2"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module78"
}