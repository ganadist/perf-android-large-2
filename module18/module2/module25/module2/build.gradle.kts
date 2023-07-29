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
    api(project(":module01:module13"))
    api(project(":module01:module36"))
    api(project(":module06:module027:module3"))
    api(project(":module06:module055:module3"))
    api(project(":module06:module056:module3"))
    api(project(":module06:module180:module5"))
    api(project(":module06:module181:module5"))
    api(project(":module06:module228:module3"))
    api(project(":module06:module236:module6"))
    api(project(":module06:module276:module1"))
    api(project(":module07:module13:module4"))
    api(project(":module07:module39:module1:module1"))
    api(project(":module07:module39:module2:module5"))
    api(project(":module07:module39:module4:module5"))
    api(project(":module07:module59:module03:module1"))
    api(project(":module07:module59:module09:module5"))
    api(project(":module07:module59:module10:module4"))
    api(project(":module07:module59:module19:module1"))
    api(project(":module07:module81:module6"))
    api(project(":module18:module1:module01:module1"))
    api(project(":module18:module1:module02:module1"))
    api(project(":module18:module1:module04:module3"))
    api(project(":module18:module1:module07:module3"))
    api(project(":module18:module1:module08:module3"))
    api(project(":module18:module1:module09:module4"))
    api(project(":module18:module1:module10:module4"))
    api(project(":module18:module1:module11:module4"))
    api(project(":module18:module1:module13:module1"))
    api(project(":module18:module1:module14:module1"))
    api(project(":module18:module1:module16:module4"))
    api(project(":module18:module1:module17:module4"))
    api(project(":module18:module1:module18:module1"))
    api(project(":module18:module1:module19:module4"))
    api(project(":module18:module1:module20:module4"))
    api(project(":module18:module1:module22:module1"))
    api(project(":module18:module1:module24:module3"))
    api(project(":module18:module1:module23:module4"))
    api(project(":module18:module1:module27:module5"))
    api(project(":module18:module1:module28:module1"))
    api(project(":module18:module2:module02:module4"))
    api(project(":module18:module2:module04:module4"))
    api(project(":module18:module2:module03:module4"))
    api(project(":module18:module2:module09:module5"))
    api(project(":module18:module2:module10:module4"))
    api(project(":module18:module2:module11:module4"))
    api(project(":module18:module2:module12:module3"))
    api(project(":module18:module2:module13:module2"))
    api(project(":module18:module2:module14:module2"))
    api(project(":module18:module2:module16:module4"))
    api(project(":module18:module2:module17:module3"))
    api(project(":module18:module2:module20:module4"))
    api(project(":module18:module2:module22:module1"))
    api(project(":module18:module2:module23:module4"))
    api(project(":module18:module2:module26:module4"))
    api(project(":module18:module2:module25:module5"))
    api(project(":module18:module2:module28:module4"))
    api(project(":module18:module3:module2:module2"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module13"))
    implementation(project(":module01:module36"))
    implementation(project(":module06:module027:module3"))
    implementation(project(":module06:module055:module3"))
    implementation(project(":module06:module056:module3"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module180:module5"))
    implementation(project(":module06:module181:module5"))
    implementation(project(":module06:module228:module3"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module07:module13:module4"))
    implementation(project(":module07:module39:module1:module1"))
    implementation(project(":module07:module39:module2:module5"))
    implementation(project(":module07:module39:module4:module5"))
    implementation(project(":module07:module59:module03:module1"))
    implementation(project(":module07:module59:module09:module5"))
    implementation(project(":module07:module59:module10:module4"))
    implementation(project(":module07:module59:module19:module1"))
    implementation(project(":module07:module68"))
    implementation(project(":module07:module81:module6"))
    implementation(project(":module18:module1:module01:module1"))
    implementation(project(":module18:module1:module02:module1"))
    implementation(project(":module18:module1:module04:module3"))
    implementation(project(":module18:module1:module06:module1"))
    implementation(project(":module18:module1:module07:module3"))
    implementation(project(":module18:module1:module08:module3"))
    implementation(project(":module18:module1:module09:module4"))
    implementation(project(":module18:module1:module10:module4"))
    implementation(project(":module18:module1:module11:module4"))
    implementation(project(":module18:module1:module13:module1"))
    implementation(project(":module18:module1:module14:module1"))
    implementation(project(":module18:module1:module15:module2"))
    implementation(project(":module18:module1:module16:module4"))
    implementation(project(":module18:module1:module17:module4"))
    implementation(project(":module18:module1:module18:module1"))
    implementation(project(":module18:module1:module19:module4"))
    implementation(project(":module18:module1:module20:module4"))
    implementation(project(":module18:module1:module21:module3"))
    implementation(project(":module18:module1:module22:module1"))
    implementation(project(":module18:module1:module24:module3"))
    implementation(project(":module18:module1:module23:module4"))
    implementation(project(":module18:module1:module27:module5"))
    implementation(project(":module18:module1:module28:module1"))
    implementation(project(":module18:module2:module01:module4"))
    implementation(project(":module18:module2:module02:module4"))
    implementation(project(":module18:module2:module04:module4"))
    implementation(project(":module18:module2:module03:module4"))
    implementation(project(":module18:module2:module06:module4"))
    implementation(project(":module18:module2:module09:module5"))
    implementation(project(":module18:module2:module10:module4"))
    implementation(project(":module18:module2:module11:module4"))
    implementation(project(":module18:module2:module12:module3"))
    implementation(project(":module18:module2:module13:module2"))
    implementation(project(":module18:module2:module14:module2"))
    implementation(project(":module18:module2:module16:module4"))
    implementation(project(":module18:module2:module17:module3"))
    implementation(project(":module18:module2:module20:module4"))
    implementation(project(":module18:module2:module22:module1"))
    implementation(project(":module18:module2:module23:module4"))
    implementation(project(":module18:module2:module26:module4"))
    implementation(project(":module18:module2:module25:module5"))
    implementation(project(":module18:module2:module28:module4"))
    implementation(project(":module18:module3:module1"))
    implementation(project(":module18:module3:module2:module2"))
    implementation(project(":module18:module3:module6"))
    implementation(project(":module18:module3:module8"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module067"))
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module158"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module39:module2:module1"))
    testImplementation(project(":module18:module1:module07:module1"))
    testImplementation(project(":module18:module1:module09:module1"))
    testImplementation(project(":module18:module1:module10:module1"))
    testImplementation(project(":module18:module1:module15:module1"))
    testImplementation(project(":module18:module1:module17:module1"))
    testImplementation(project(":module18:module1:module19:module1"))
    testImplementation(project(":module18:module1:module20:module1"))
    testImplementation(project(":module18:module1:module25:module1"))
    testImplementation(project(":module18:module2:module18:module4"))
    testImplementation(project(":module18:module2:module19:module5"))
    testImplementation(project(":module18:module3:module7"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module18.module2.module25.module2"
}