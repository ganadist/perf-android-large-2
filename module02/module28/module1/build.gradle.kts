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
    api(project(":module01:module21"))
    api(project(":module02:module28:module3"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module325:module2"))
    api(project(":module07:module54"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module21"))
    implementation(project(":module02:module28:module3"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module172:module5"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module325:module2"))
    implementation(project(":module06:module345"))
    implementation(project(":module07:module54"))
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module28.module1"
}
