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
    api(project(":module06:module109:module1"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module198:module1"))
    implementation(project(":module06:module294:module1"))
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.helpshift:android-helpshift-aar:7.7.2")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module38"
}
