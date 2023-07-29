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
    api(project(":module01:module15"))
    api(project(":module06:module067"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module110"))
    api(project(":module06:module165:module9"))
    api(project(":module06:module243"))
    api(project(":module06:module254"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module348"))
    api("com.squareup:android-times-square:1.7.10")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module15"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module348"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module40:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.squareup:android-times-square:1.7.10")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module194"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module279:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module324:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module167"
}
