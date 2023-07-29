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
    api(project(":module05:module05:module6"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module254"))
    api(project(":module06:module260"))
    api("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    api("com.squareup.retrofit2:converter-gson:2.7.2")
    api("com.squareup.retrofit2:converter-wire:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module01:module35"))
    implementation(project(":module05:module05:module6"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module260"))
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation("com.squareup.retrofit2:converter-gson:2.7.2")
    implementation("com.squareup.retrofit2:converter-wire:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module05.module05.module3"
}