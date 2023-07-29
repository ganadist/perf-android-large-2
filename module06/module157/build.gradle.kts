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
    api(project(":module06:module010:module1"))
    api(project(":module06:module025:module2"))
    api(project(":module06:module054:module6"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module279:module1"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module04:module19:module6"))
    implementation(project(":module06:module010:module1"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module025:module2"))
    implementation(project(":module06:module054:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module239:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module323"))
    implementation(project(":module06:module342:module3"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.google.zxing:core:3.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.squareup:pollexor:2.0.4")
    implementation("com.starmicronics:stario:2.9.0")
    implementation("com.starmicronics:starioextension:1.15.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module157"
}
