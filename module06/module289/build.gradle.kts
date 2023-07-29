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
    api(project(":module01:module27"))
    api(project(":module01:module28"))
    api(project(":module01:module29"))
    api(project(":module06:module002:module5"))
    api(project(":module06:module313:module5"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module27"))
    implementation(project(":module01:module28"))
    implementation(project(":module01:module29"))
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module290:module4"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module2"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:legacy-workflow-test:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module289"
}
