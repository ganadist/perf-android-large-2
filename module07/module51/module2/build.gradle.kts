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
    api(project(":module01:module36"))
    api(project(":module06:module004:module4"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module202:module1"))
    api(project(":module06:module206:module1"))
    api(project(":module06:module207"))
    api(project(":module06:module243"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module354:module2"))
    api(project(":module06:module353:module1"))
    api(project(":module06:module353:module2"))
    api(project(":module07:module51:module5"))
    api("com.squareup.cycler:cycler:0.1.4")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module36"))
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module202:module1"))
    implementation(project(":module06:module206:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module268"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module354:module2"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation(project(":module07:module51:module5"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.squareup.cycler:cycler:0.1.4")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.workflow:legacy-workflow-core:0.23.2")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    implementation("org.jetbrains:annotations:13.0")
    testImplementation(project(":module06:module134:module1"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module337:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module51.module2"
}
