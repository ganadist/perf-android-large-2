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
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module02:module37:module03:module2"))
    implementation(project(":module02:module37:module07:module2"))
    implementation(project(":module02:module37:module11:module2"))
    implementation(project(":module02:module37:module28:module4"))
    implementation(project(":module02:module37:module31"))
    implementation("androidx.sqlite:sqlite-framework:2.0.1")
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.sqlbrite3:sqlbrite-kotlin:3.2.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module37.module30"
}
