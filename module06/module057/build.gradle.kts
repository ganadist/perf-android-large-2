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
    api(project(":module06:module124"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module157"))
    api(project(":module06:module254"))
    api(project(":module06:module298:module1"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api("com.google.dagger:dagger:2.28")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module124"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module057"
}
