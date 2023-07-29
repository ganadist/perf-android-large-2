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
    api(project(":module06:module228:module3"))
    api(project(":module06:module258:module4"))
    api(project(":module06:module294:module3"))
    api(project(":module06:module297:module4"))
    api(project(":module06:module295:module6"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module340:module3"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module228:module3"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module295:module6"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module351:module1"))
    implementation("com.dropbox.mobile.store:store4:4.0.0-alpha05")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.rx2)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module228:module4"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module06.module228.module1"
}
