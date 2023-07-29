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
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module02:module37:module11:module1"))
    implementation(project(":module02:module37:module26:module3"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module06:module282:module1"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("androidx.viewpager:viewpager:1.0.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module02:module37:module30"))
    testImplementation(project(":module02:module37:module32"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module02.module37.module34"
}