plugins{
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
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
    api(project(":module06:module004:module2"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module298:module1"))
    api("androidx.annotation:annotation:1.1.0")
    api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module004:module2"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module298:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module139"
}
