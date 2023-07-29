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
    api(project(":module06:module002:module5"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module337:module3"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-backstack-android:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-common-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-modal-android:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module086:module2"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module337:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module087.module1"
}