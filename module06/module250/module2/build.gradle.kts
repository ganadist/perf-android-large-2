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
    api(project(":module06:module109:module1"))
    api(project(":module06:module157"))
    api(project(":module06:module250:module4"))
    api(project(":module06:module323"))
    api(project(":module06:module326"))
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation(project(":module06:module067"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module323"))
    implementation(project(":module06:module326"))
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module092"))
    testImplementation(project(":module06:module143:module6"))
    testImplementation(project(":module06:module158"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module238:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module250.module2"
}
