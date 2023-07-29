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
    api(project(":module06:module060:module3"))
    api(project(":module06:module172:module5"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module18"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module060:module3"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module173:module1"))
    implementation(project(":module06:module172:module5"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module331"))
    implementation(project(":module07:module21:module11:module5"))
    implementation(project(":module15:module41:module1"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module172.module3"
}
