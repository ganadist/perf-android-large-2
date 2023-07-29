plugins{
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
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
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module28"))
    implementation(project(":module04:module12:module6"))
    implementation(project(":module04:module15"))
    implementation(project(":module04:module16:module7"))
    implementation(project(":module04:module17:module4"))
    implementation(project(":module06:module009:module5"))
    implementation(project(":module06:module013:module4"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module321:module03"))
    implementation(project(":module06:module321:module07"))
    implementation(project(":module06:module321:module09"))
    implementation(project(":module06:module337:module2"))
    implementation(project(":module06:module340:module2"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module22:module01:module05:module2"))
    implementation(project(":module22:module01:module23"))
    implementation(project(":module22:module01:module28:module3"))
    implementation(project(":module22:module01:module41"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.google.zxing:core:3.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module50"
}
