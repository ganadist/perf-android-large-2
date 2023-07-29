plugins{
  id("com.android.library")
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
    api(project(":module06:module294:module1"))
    api(project(":module06:module313:module5"))
    api(project(":module07:module24"))
    api(project(":module07:module62"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module01"))
    implementation(project(":module01:module14"))
    implementation(project(":module01:module15"))
    implementation(project(":module01:module22"))
    implementation(project(":module01:module25"))
    implementation(project(":module01:module31"))
    implementation(project(":module01:module33"))
    implementation(project(":module01:module36"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module170:module4"))
    implementation(project(":module06:module213:module5"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module353:module3"))
    implementation(project(":module06:module357"))
    implementation(project(":module07:module08:module8"))
    implementation(project(":module07:module24"))
    implementation(project(":module07:module43:module3"))
    implementation(project(":module07:module53:module3"))
    implementation(project(":module07:module62"))
    implementation(project(":module10"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module36"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module22.module07.module28"
}
