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
    api(project(":module01:module13"))
    api(project(":module06:module188:module5"))
    api(project(":module06:module357"))
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module13"))
    implementation(project(":module06:module187:module5"))
    implementation(project(":module06:module188:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module357"))
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module07.module03.module1"
}
