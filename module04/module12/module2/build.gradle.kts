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
    api(project(":module04:module06"))
    api(project(":module04:module12:module6"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module04:module03:module3"))
    implementation(project(":module04:module06"))
    implementation(project(":module04:module11:module3"))
    implementation(project(":module04:module13:module1"))
    implementation(project(":module04:module12:module1"))
    implementation(project(":module04:module12:module6"))
    implementation(project(":module04:module15"))
    implementation(project(":module04:module16:module8"))
    implementation(project(":module04:module17:module6"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module270"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module05:module2"))
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module04.module12.module2"
}
