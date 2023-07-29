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
    api(project(":module06:module009:module6"))
    api(project(":module06:module044:module2"))
    api(project(":module06:module090:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module114"))
    api(project(":module06:module130:module2"))
    api(project(":module06:module201:module1"))
    api(project(":module06:module281:module1"))
    api(project(":module06:module287:module3"))
    api(project(":module06:module320:module1"))
    api(project(":module06:module321:module10"))
    api(project(":module06:module337:module3"))
    api(project(":module06:module340:module3"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module356:module1"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.core:core-ktx:1.2.0")
    api("androidx.legacy:legacy-support-core-utils:1.0.0")
    api("com.google.code.gson:gson:2.8.5")
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("com.jakewharton.timber:timber:4.6.1")
    api("com.squareup:pollexor:2.0.4")
    api("io.reactivex.rxjava2:rxandroid:2.1.1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module009:module6"))
    implementation(project(":module06:module044:module2"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module130:module2"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module287:module3"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module340:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module356:module1"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.legacy:legacy-support-core-utils:1.0.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup:pollexor:2.0.4")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
}

android {
    namespace = "pkg.android.module06.module339.module1"
}