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
    api(project(":module07:module39:module2:module5"))
    api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module07:module39:module2:module5"))
    implementation(project(":module07:module39:module3:module4"))
    implementation(project(":module15:module39:module1"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("androidx.test:core:1.1.0")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module07.module39.module2.module3"
}
