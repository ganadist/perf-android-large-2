plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module109:module1"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module359"))
    api(project(":module22:module01:module41"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.coordinators:coordinators:0.5")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module33"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module359"))
    implementation(project(":module22:module01:module05:module3"))
    implementation(project(":module22:module01:module14"))
    implementation(project(":module22:module01:module41"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module01.module39"
}
