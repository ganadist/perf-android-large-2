plugins{
  id("com.android.library")
  id("kotlin-android")
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
    api(project(":module06:module336:module1"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module178:module3"))
    implementation(project(":module06:module195"))
    implementation(project(":module06:module325:module1"))
    implementation(project(":module06:module324:module4"))
    implementation(project(":module06:module336:module1"))
    implementation(project(":module06:module347"))
    implementation(project(":module06:module349"))
    implementation(project(":module09:module6"))
    implementation(project(":module22:module01:module18"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module01.module19"
}
