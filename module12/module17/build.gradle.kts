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
    api(project(":module01:module21"))
    api(project(":module06:module013:module6"))
    api(project(":module06:module042:module5"))
    api(project(":module07:module54"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module21"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module042:module5"))
    implementation(project(":module06:module139"))
    implementation(project(":module06:module196:module4"))
    implementation(project(":module06:module345"))
    implementation(project(":module07:module54"))
    implementation(project(":module10"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module12.module17"
}
