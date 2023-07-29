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
    api(project(":module06:module025:module2"))
    api(project(":module06:module159"))
    api(project(":module06:module340:module2"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    implementation(project(":module04:module01:module1"))
    implementation(project(":module04:module03:module1"))
    implementation(project(":module04:module04:module1"))
    implementation(project(":module04:module06"))
    implementation(project(":module04:module16:module8"))
    implementation(project(":module04:module17:module6"))
    implementation(project(":module04:module20"))
    implementation(project(":module06:module025:module2"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module270"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module340:module2"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module07:module1"))
    implementation(project(":module15:module62:module1"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.android)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module04:module05"))
    testImplementation(project(":module04:module06"))
    testImplementation(project(":module06:module050"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module04.module15"
}
