plugins{
  id("com.android.library")
  id("kotlin-android")
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
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    annotationProcessor("com.uber.nullaway:nullaway:0.7.2")
    api(project(":module01:module39"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module159"))
    api(project(":module06:module175"))
    api(project(":module06:module178:module6"))
    api(project(":module06:module325:module2"))
    api(project(":module06:module324:module4"))
    api(project(":module06:module339:module1"))
    api(project(":module06:module348"))
    api(project(":module06:module359"))
    api(project(":module22:module01:module04:module3"))
    api(project(":module22:module01:module14"))
    api(project(":module22:module01:module15:module1"))
    api(project(":module22:module01:module33"))
    api(project(":module22:module01:module39"))
    api(project(":module22:module01:module48"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.coordinators:coordinators:0.5")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module39"))
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module175"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module182:module5"))
    implementation(project(":module06:module325:module2"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module359"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module22:module01:module04:module3"))
    implementation(project(":module22:module01:module14"))
    implementation(project(":module22:module01:module15:module1"))
    implementation(project(":module22:module01:module16:module1"))
    implementation(project(":module22:module01:module28:module4"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module39"))
    implementation(project(":module22:module01:module48"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.coordinators:coordinators:0.5")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module01.module25"
}