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
    api(project(":module15:module20:module1"))
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module348"))
    implementation(project(":module15:module20:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module07.module36"
}
