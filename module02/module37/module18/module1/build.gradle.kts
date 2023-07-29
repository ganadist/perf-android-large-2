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
    api(project(":module02:module37:module18:module3"))
    api(project(":module02:module37:module17:module1"))
    api(project(":module02:module37:module33:module3"))
    api("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module02:module37:module11:module1"))
    implementation(project(":module02:module37:module18:module3"))
    implementation(project(":module02:module37:module17:module1"))
    implementation(project(":module02:module37:module33:module3"))
    implementation("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module18.module1"
}
