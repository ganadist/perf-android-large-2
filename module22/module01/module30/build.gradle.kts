plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module06:module183:module7"))
    api(project(":module22:module01:module28:module4"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module183:module7"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module22:module01:module14"))
    implementation(project(":module22:module01:module28:module4"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module22.module01.module30"
}
