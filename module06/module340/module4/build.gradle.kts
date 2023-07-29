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
    api(project(":module06:module340:module3"))
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module340:module3"))
    implementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    implementation(libs.kotlin.stdlib)
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
}

android {
    namespace = "pkg.android.module06.module340.module4"
}
