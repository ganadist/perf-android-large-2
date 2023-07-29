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
    api(project(":module01:module02"))
    api(project(":module06:module032"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module298:module1"))
    api(project(":module06:module339:module1"))
    api("com.appsflyer:af-android-sdk:4.8.19")
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module02"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module06:module339:module1"))
    implementation("com.android.installreferrer:installreferrer:1.0")
    implementation("com.appsflyer:af-android-sdk:4.8.19")
    implementation("com.google.android.gms:play-services-ads-identifier:17.0.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module02"
}
