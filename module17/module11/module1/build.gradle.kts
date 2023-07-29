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
    api(project(":module04:module09:module4"))
    api(project(":module06:module321:module10"))
    api(project(":module17:module11:module2"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module04:module06"))
    implementation(project(":module04:module09:module4"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module321:module10"))
    implementation(project(":module17:module01:module3"))
    implementation(project(":module17:module11:module2"))
    implementation(project(":module17:module12:module3:module3"))
    implementation("androidx.lifecycle:lifecycle-common-java8:2.2.0")
    implementation("androidx.lifecycle:lifecycle-common:2.1.0")
    implementation("androidx.lifecycle:lifecycle-process:2.2.0")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.jakewharton.timber:timber:4.6.1")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.rx2)
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-runtime-jvm:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module17.module11.module1"
}
