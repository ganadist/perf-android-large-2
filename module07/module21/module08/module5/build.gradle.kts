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
    api(project(":module06:module254"))
    api(project(":module07:module21:module01:module5"))
    api(project(":module07:module21:module03:module1"))
    api(project(":module07:module21:module09:module1"))
    api(project(":module15:module05:module2"))
    api(project(":module15:module15:module1"))
    api(project(":module15:module41:module1"))
    api("androidx.annotation:annotation:1.1.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module254"))
    implementation(project(":module07:module21:module01:module5"))
    implementation(project(":module07:module21:module03:module1"))
    implementation(project(":module07:module21:module09:module1"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module15:module1"))
    implementation(project(":module15:module41:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module21.module08.module5"
}
