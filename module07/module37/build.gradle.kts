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
    api(project(":module01:module13"))
    api(project(":module06:module097:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module317"))
    api(project(":module06:module342:module3"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("javax.inject:javax.inject:1")
    implementation(project(":module01:module13"))
    implementation(project(":module06:module053"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module177"))
    implementation(project(":module06:module315"))
    implementation(project(":module06:module317"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module357"))
    implementation(project(":module07:module34"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module07.module37"
}
