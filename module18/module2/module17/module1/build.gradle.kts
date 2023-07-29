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
    api(project(":module18:module2:module17:module3"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module18:module1:module02:module1"))
    implementation(project(":module18:module1:module06:module1"))
    implementation(project(":module18:module1:module15:module2"))
    implementation(project(":module18:module1:module17:module4"))
    implementation(project(":module18:module1:module27:module5"))
    implementation(project(":module18:module2:module11:module4"))
    implementation(project(":module18:module2:module18:module4"))
    implementation(project(":module18:module2:module19:module5"))
    implementation(project(":module18:module2:module17:module3"))
    implementation(project(":module18:module3:module2:module2"))
    implementation(project(":module18:module3:module6"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module18:module1:module07:module1"))
    testImplementation(project(":module18:module1:module15:module1"))
    testImplementation(project(":module18:module1:module16:module1"))
    testImplementation(project(":module18:module2:module19:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module2.module17.module1"
}