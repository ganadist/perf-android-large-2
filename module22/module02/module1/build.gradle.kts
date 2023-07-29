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
    androidTestImplementation(project(":module03:module05:module1:module1"))
    androidTestImplementation(project(":module06:module021"))
    androidTestImplementation(project(":module06:module122:module2"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation(project(":module06:module310"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module08:module1"))
    androidTestImplementation(project(":module08:module2"))
    androidTestImplementation(project(":module22:module01:module40:module1"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("junit:junit:4.13")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module33"))
    implementation(project(":module03:module05:module1:module2"))
    implementation(project(":module06:module002:module3"))
    implementation(project(":module06:module020:module4"))
    implementation(project(":module06:module031:module2"))
    implementation(project(":module06:module063:module5"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module087:module1"))
    implementation(project(":module06:module096:module4"))
    implementation(project(":module06:module121:module2"))
    implementation(project(":module06:module122:module4"))
    implementation(project(":module06:module125"))
    implementation(project(":module06:module126"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module209"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module284:module3"))
    implementation(project(":module06:module353:module6"))
    implementation(project(":module07:module45"))
    implementation(project(":module07:module79"))
    implementation(project(":module15:module57:module1"))
    implementation(project(":module22:module01:module02"))
    implementation(project(":module22:module01:module04:module2"))
    implementation(project(":module22:module01:module05:module2"))
    implementation(project(":module22:module01:module09:module2"))
    implementation(project(":module22:module01:module09:module4"))
    implementation(project(":module22:module01:module09:module5"))
    implementation(project(":module22:module01:module11"))
    implementation(project(":module22:module01:module12"))
    implementation(project(":module22:module01:module21"))
    implementation(project(":module22:module01:module28:module3"))
    implementation(project(":module22:module01:module36"))
    implementation(project(":module22:module01:module38:module2"))
    implementation(project(":module22:module01:module40:module4"))
    implementation(project(":module22:module02:module2:module2"))
    implementation(project(":module22:module02:module3:module2"))
    implementation(project(":module22:module02:module4:module1"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module22.module02.module1"
}