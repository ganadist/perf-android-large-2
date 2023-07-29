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
    implementation(project(":module01:module05"))
    implementation(project(":module02:module12"))
    implementation(project(":module02:module29"))
    implementation(project(":module02:module37:module28:module3"))
    implementation(project(":module06:module116"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module02.module20"
}
