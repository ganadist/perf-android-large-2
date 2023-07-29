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
    api(project(":module06:module192"))
    api(project(":module06:module194"))
    api(project(":module06:module207"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api("androidx.recyclerview:recyclerview:1.0.0")
    api("com.squareup.coordinators:coordinators:0.5")
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("com.squareup.coordinators:coordinators:0.5")
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module359"
}
