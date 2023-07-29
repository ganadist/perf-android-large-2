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
    api(project(":module06:module020:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module07:module45"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module020:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module183:module7"))
    implementation(project(":module07:module45"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module21.module01"
}
