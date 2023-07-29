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
    api(project(":module06:module011"))
    api(project(":module06:module149"))
    api(project(":module06:module192"))
    api(project(":module06:module196:module4"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module243"))
    api(project(":module06:module254"))
    api(project(":module06:module315"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module353:module3"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.coordinators:coordinators:0.5")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module011"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module196:module4"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module353:module3"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module280:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:legacy-workflow-test:0.23.2")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module189"
}