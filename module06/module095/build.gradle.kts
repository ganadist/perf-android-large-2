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
    api(project(":module06:module147:module9:module5"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module025:module2"))
    implementation(project(":module06:module035:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module096:module5"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module147:module9:module5"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module212"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module318:module5"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module356:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("com.bugsnag:bugsnag-android:5.0.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module095"
}
