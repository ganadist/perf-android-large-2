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
    androidTestImplementation(project(":module06:module195"))
    androidTestImplementation(project(":module06:module325:module1"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module06:module336:module1"))
    androidTestImplementation(project(":module06:module347"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module06:module002:module5"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module33"))
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module009:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module121:module1"))
    implementation(project(":module06:module121:module2"))
    implementation(project(":module06:module121:module3"))
    implementation(project(":module06:module175"))
    implementation(project(":module06:module182:module5"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module298:module2"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module321:module03"))
    implementation(project(":module06:module321:module07"))
    implementation(project(":module06:module321:module09"))
    implementation(project(":module06:module325:module2"))
    implementation(project(":module06:module324:module3"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module337:module2"))
    implementation(project(":module06:module340:module2"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module359"))
    implementation(project(":module22:module01:module05:module2"))
    implementation(project(":module22:module01:module14"))
    implementation(project(":module22:module01:module15:module1"))
    implementation(project(":module22:module01:module28:module3"))
    implementation(project(":module22:module01:module28:module4"))
    implementation(project(":module22:module01:module32"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module39"))
    implementation(project(":module22:module01:module41"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.flow:flow:1.0.0-alpha3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module22.module01.module44"
}