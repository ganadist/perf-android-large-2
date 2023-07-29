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
    api(project(":module22:module01:module21"))
    api(project(":module22:module01:module35"))
    api(project(":module22:module04:module08"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module19"))
    implementation(project(":module01:module32"))
    implementation(project(":module01:module33"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module183:module7"))
    implementation(project(":module06:module253"))
    implementation(project(":module07:module45"))
    implementation(project(":module22:module01:module09:module7"))
    implementation(project(":module22:module01:module12"))
    implementation(project(":module22:module01:module14"))
    implementation(project(":module22:module01:module17:module2"))
    implementation(project(":module22:module01:module16:module1"))
    implementation(project(":module22:module01:module21"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module04:module08"))
    implementation("com.google.dagger:dagger:2.28")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module01.module11"
}
