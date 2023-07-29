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
    api(project(":module06:module086:module1"))
    api(project(":module18:module1:module07:module3"))
    api(project(":module18:module1:module10:module4"))
    api(project(":module18:module1:module16:module4"))
    api(project(":module18:module1:module26:module4"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module067"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module18:module1:module06:module1"))
    implementation(project(":module18:module1:module07:module3"))
    implementation(project(":module18:module1:module10:module4"))
    implementation(project(":module18:module1:module16:module4"))
    implementation(project(":module18:module1:module26:module4"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module18:module1:module07:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module1.module26.module2"
}