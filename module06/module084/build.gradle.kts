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
    api(project(":module06:module086:module1"))
    api(project(":module06:module149"))
    api(project(":module06:module150"))
    api(project(":module06:module353:module1"))
    api(project(":module06:module353:module2"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(project(":module06:module085"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module150"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module2"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.workflow:workflow-ui-backstack-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.3.7")
    testImplementation(project(":module06:module086:module2"))
    testImplementation(project(":module06:module201:module1"))
    testImplementation(project(":module06:module337:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module084"
}