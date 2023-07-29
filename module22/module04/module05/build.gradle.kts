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
    api(project(":module01:module18"))
    api(project(":module01:module33"))
    api(project(":module06:module034:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module172:module5"))
    api(project(":module06:module294:module1"))
    api(project(":module22:module01:module02"))
    api(project(":module22:module01:module08"))
    api(project(":module22:module01:module11"))
    api(project(":module22:module01:module12"))
    api(project(":module22:module01:module18"))
    api(project(":module22:module01:module23"))
    api(project(":module22:module01:module29"))
    api(project(":module22:module01:module30"))
    api(project(":module22:module01:module28:module4"))
    api(project(":module22:module01:module31"))
    api(project(":module22:module01:module35"))
    api(project(":module22:module01:module36"))
    api(project(":module22:module04:module10"))
    api(project(":module22:module04:module11"))
    api(project(":module22:module04:module13"))
    api(project(":module22:module04:module15:module5"))
    api(project(":module22:module04:module17"))
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.timber:timber:4.6.1")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module18"))
    implementation(project(":module01:module33"))
    implementation(project(":module04:module15"))
    implementation(project(":module06:module034:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module172:module5"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module300"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module22:module01:module02"))
    implementation(project(":module22:module01:module06:module3"))
    implementation(project(":module22:module01:module07:module3"))
    implementation(project(":module22:module01:module08"))
    implementation(project(":module22:module01:module11"))
    implementation(project(":module22:module01:module12"))
    implementation(project(":module22:module01:module17:module2"))
    implementation(project(":module22:module01:module16:module1"))
    implementation(project(":module22:module01:module18"))
    implementation(project(":module22:module01:module23"))
    implementation(project(":module22:module01:module29"))
    implementation(project(":module22:module01:module30"))
    implementation(project(":module22:module01:module28:module4"))
    implementation(project(":module22:module01:module31"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module36"))
    implementation(project(":module22:module04:module10"))
    implementation(project(":module22:module04:module11"))
    implementation(project(":module22:module04:module13"))
    implementation(project(":module22:module04:module15:module5"))
    implementation(project(":module22:module04:module17"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("org.robolectric:robolectric:4.3")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module22.module04.module05"
}
