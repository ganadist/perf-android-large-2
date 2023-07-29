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
    implementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    implementation(libs.kotlin.android.extensions)
    implementation("org.mockito:mockito-core:2.28.2")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module19.module1.module3"
}
