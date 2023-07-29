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
    api(project(":module06:module200:module2"))
    api(project(":module06:module320:module1"))
    api(project(":module06:module340:module3"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module351:module1"))
    api(project(":module15:module05:module2"))
    api(project(":module15:module21:module1"))
    api("com.google.code.gson:gson:2.8.5")
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("com.squareup.wire:wire-runtime:3.0.0")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module044:module2"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module200:module2"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module351:module1"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module21:module1"))
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module20:module1"))
    testImplementation(project(":module15:module25:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.robolectric:robolectric:4.3")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module06.module254"
}