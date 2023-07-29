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
    api(project(":module02:module37:module01:module1"))
    api(project(":module02:module37:module02:module3"))
    api(project(":module02:module37:module03:module1"))
    api(project(":module02:module37:module04:module3"))
    api(project(":module02:module37:module05:module3"))
    api(project(":module02:module37:module06:module3"))
    api(project(":module02:module37:module07:module1"))
    api(project(":module02:module37:module08:module1"))
    api(project(":module02:module37:module09:module1"))
    api(project(":module02:module37:module11:module1"))
    api(project(":module02:module37:module12:module1"))
    api(project(":module02:module37:module13:module1"))
    api(project(":module02:module37:module14:module1"))
    api(project(":module02:module37:module15:module1"))
    api(project(":module02:module37:module18:module3"))
    api(project(":module02:module37:module17:module1"))
    api(project(":module02:module37:module19:module3"))
    api(project(":module02:module37:module20:module3"))
    api(project(":module02:module37:module21:module3"))
    api(project(":module02:module37:module22:module3"))
    api(project(":module02:module37:module23:module3"))
    api(project(":module02:module37:module25:module3"))
    api(project(":module02:module37:module24:module1"))
    api(project(":module02:module37:module26:module3"))
    api(project(":module02:module37:module27:module3"))
    api(project(":module02:module37:module28:module3"))
    api(project(":module02:module37:module29:module1"))
    api(project(":module02:module37:module33:module3"))
    api(project(":module02:module37:module36:module1"))
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module02:module37:module01:module1"))
    implementation(project(":module02:module37:module02:module2"))
    implementation(project(":module02:module37:module02:module3"))
    implementation(project(":module02:module37:module03:module1"))
    implementation(project(":module02:module37:module04:module2"))
    implementation(project(":module02:module37:module04:module3"))
    implementation(project(":module02:module37:module05:module2"))
    implementation(project(":module02:module37:module05:module3"))
    implementation(project(":module02:module37:module06:module2"))
    implementation(project(":module02:module37:module06:module3"))
    implementation(project(":module02:module37:module07:module1"))
    implementation(project(":module02:module37:module08:module1"))
    implementation(project(":module02:module37:module09:module1"))
    implementation(project(":module02:module37:module11:module1"))
    implementation(project(":module02:module37:module12:module1"))
    implementation(project(":module02:module37:module13:module1"))
    implementation(project(":module02:module37:module14:module1"))
    implementation(project(":module02:module37:module15:module1"))
    implementation(project(":module02:module37:module18:module2"))
    implementation(project(":module02:module37:module18:module3"))
    implementation(project(":module02:module37:module17:module1"))
    implementation(project(":module02:module37:module19:module2"))
    implementation(project(":module02:module37:module19:module3"))
    implementation(project(":module02:module37:module20:module2"))
    implementation(project(":module02:module37:module20:module3"))
    implementation(project(":module02:module37:module21:module2"))
    implementation(project(":module02:module37:module21:module3"))
    implementation(project(":module02:module37:module22:module2"))
    implementation(project(":module02:module37:module22:module3"))
    implementation(project(":module02:module37:module23:module2"))
    implementation(project(":module02:module37:module23:module3"))
    implementation(project(":module02:module37:module25:module2"))
    implementation(project(":module02:module37:module25:module3"))
    implementation(project(":module02:module37:module24:module1"))
    implementation(project(":module02:module37:module26:module2"))
    implementation(project(":module02:module37:module26:module3"))
    implementation(project(":module02:module37:module27:module2"))
    implementation(project(":module02:module37:module27:module3"))
    implementation(project(":module02:module37:module28:module2"))
    implementation(project(":module02:module37:module28:module3"))
    implementation(project(":module02:module37:module29:module1"))
    implementation(project(":module02:module37:module33:module2"))
    implementation(project(":module02:module37:module33:module3"))
    implementation(project(":module02:module37:module36:module1"))
    implementation(project(":module06:module011"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module324:module4"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module31"
}
