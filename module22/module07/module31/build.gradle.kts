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
    api(project(":module06:module109:module1"))
    api("com.google.dagger:dagger:2.28")
    api(libs.kotlin.stdlib)
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module33"))
    implementation(project(":module01:module34"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module116"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module313:module5"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module06:module359"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module07.module31"
}
