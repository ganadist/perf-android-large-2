plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    api(project(":module01:module19"))
    api(project(":module01:module33"))
    api(project(":module06:module313:module5"))
    api(project(":module22:module01:module28:module4"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module19"))
    implementation(project(":module01:module33"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module10"))
    implementation(project(":module22:module01:module28:module4"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module36"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module04.module13"
}
