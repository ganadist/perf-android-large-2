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
    api(project(":module01:module06"))
    api(project(":module05:module01:module14:module4"))
    api(project(":module05:module04:module4"))
    api(project(":module05:module12:module4"))
    api(project(":module06:module039:module5"))
    api(project(":module06:module043"))
    api(project(":module06:module048"))
    api(project(":module06:module067"))
    api(project(":module06:module084"))
    api(project(":module06:module127"))
    api(project(":module06:module194"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module353:module5"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module06"))
    implementation(project(":module01:module07"))
    implementation(project(":module05:module01:module14:module4"))
    implementation(project(":module05:module04:module4"))
    implementation(project(":module05:module12:module4"))
    implementation(project(":module06:module039:module5"))
    implementation(project(":module06:module043"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module353:module3"))
    implementation(project(":module06:module353:module5"))
    implementation(project(":module15:module36:module1"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module01.module35"
}
