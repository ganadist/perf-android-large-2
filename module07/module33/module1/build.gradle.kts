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
    api(project(":module06:module109:module1"))
    api(project(":module06:module192"))
    api(project(":module06:module254"))
    api(project(":module06:module267:module1"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module059:module1"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module15:module36:module1"))
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module07.module33.module1"
}