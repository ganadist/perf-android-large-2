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
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("com.squareup.okio:okio:2.2.2")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module06.module322.module1"
}