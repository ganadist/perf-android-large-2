plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module06:module002:module5"))
    api(project(":module06:module004:module4"))
    api(project(":module06:module009:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module119:module9"))
    api(project(":module06:module121:module3"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module004:module4"))
    implementation(project(":module06:module009:module6"))
    implementation(project(":module06:module015:module5"))
    implementation(project(":module06:module087:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module9"))
    implementation(project(":module06:module121:module3"))
    implementation(project(":module06:module122:module4"))
    implementation(project(":module06:module176:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module282:module1"))
    implementation(project(":module06:module337:module3"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.jakewharton:process-phoenix:2.0.0")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module119.module4"
}
