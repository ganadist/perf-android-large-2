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
    api("com.google.truth:truth:1.0")
    api("junit:junit:4.13")
    api("org.mockito:mockito-core:2.28.2")
    api("org.robolectric:robolectric:4.3")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module298:module4"))
    implementation(project(":module06:module339:module2"))
    implementation("com.google.truth:truth:1.0")
    implementation("junit:junit:4.13")
    implementation("org.mockito:mockito-core:2.28.2")
    implementation("org.robolectric:robolectric:4.3")
    testImplementation(project(":module06:module298:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
}

android {
    namespace = "pkg.android.module06.module158"
}
