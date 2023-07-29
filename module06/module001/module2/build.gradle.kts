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
    api(project(":module06:module001:module5"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module086:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module149"))
    api(project(":module06:module160:module1"))
    api(project(":module06:module178:module6"))
    api(project(":module06:module243"))
    api(project(":module06:module340:module3"))
    api("androidx.annotation:annotation:1.1.0")
    api("com.squareup.coordinators:coordinators:0.5")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module001:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module113:module6"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module160:module1"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module345"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module001.module2"
}