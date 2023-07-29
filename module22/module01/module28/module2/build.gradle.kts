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
    api(project(":module01:module28"))
    api(project(":module06:module090:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module15:module21:module1"))
    api(project(":module22:module01:module28:module4"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module28"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module356:module1"))
    implementation(project(":module15:module21:module1"))
    implementation(project(":module22:module01:module28:module4"))
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module01.module28.module2"
}
