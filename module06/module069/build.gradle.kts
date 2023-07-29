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
    api(project(":module06:module342:module3"))
    api("com.google.truth:truth:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module048"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module073:module8"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module245"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module342:module4"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module56:module1"))
    implementation("com.google.truth:truth:1.0")
    testImplementation(project(":module05:module03:module2"))
    testImplementation(project(":module06:module013:module6"))
    testImplementation(project(":module06:module073:module7"))
    testImplementation(project(":module06:module083:module02"))
    testImplementation(project(":module06:module097:module1"))
    testImplementation(project(":module06:module130:module1"))
    testImplementation(project(":module06:module156:module3"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module297:module1"))
    testImplementation(project(":module06:module297:module4"))
    testImplementation(project(":module06:module297:module5"))
    testImplementation(project(":module06:module295:module4"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module16:module1"))
    testImplementation("com.squareup.transaction-line-item-calculations:transaction-line-item-calculations:1.1.0")
    testImplementation("io.reactivex:rxjava:1.3.8")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.7")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module069"
}
