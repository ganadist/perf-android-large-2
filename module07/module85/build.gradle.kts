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
    api(project(":module01:module22"))
    api(project(":module01:module36"))
    api(project(":module01:module39"))
    api(project(":module06:module243"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module22"))
    implementation(project(":module01:module36"))
    implementation(project(":module01:module39"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module230:module2"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module339:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module077"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module134:module1"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module297:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module85"
}
