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
    api(project(":module06:module290:module4"))
    api(project(":module06:module336:module1"))
    api(libs.kotlin.stdlib)
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module04:module20"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module050"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module290:module1"))
    implementation(project(":module06:module290:module3"))
    implementation(project(":module06:module290:module4"))
    implementation(project(":module06:module335:module1"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module349"))
    implementation("androidx.test.espresso:espresso-core:3.1.0")
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module290.module2"
}
