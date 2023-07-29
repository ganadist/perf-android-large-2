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
    api(project(":module17:module01:module1"))
    api(project(":module17:module01:module3"))
    api("com.google.dagger:dagger:2.28")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module03:module04:module1:module1"))
    implementation(project(":module04:module12:module5"))
    implementation(project(":module04:module20"))
    implementation(project(":module06:module009:module5"))
    implementation(project(":module06:module010:module1"))
    implementation(project(":module06:module013:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module063:module5"))
    implementation(project(":module06:module079:module1"))
    implementation(project(":module06:module083:module08"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module095"))
    implementation(project(":module06:module096:module2"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module143:module5"))
    implementation(project(":module06:module147:module9:module3"))
    implementation(project(":module06:module156:module2"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module159"))
    implementation(project(":module06:module161:module2"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module183:module5"))
    implementation(project(":module06:module183:module6"))
    implementation(project(":module06:module198:module1"))
    implementation(project(":module06:module200:module1"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module295:module5"))
    implementation(project(":module06:module298:module1"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module321:module03"))
    implementation(project(":module06:module321:module05"))
    implementation(project(":module06:module321:module07"))
    implementation(project(":module06:module321:module09"))
    implementation(project(":module06:module337:module2"))
    implementation(project(":module06:module340:module2"))
    implementation(project(":module06:module342:module2"))
    implementation(project(":module17:module01:module1"))
    implementation(project(":module17:module01:module3"))
    implementation(project(":module17:module02:module1"))
    implementation(project(":module17:module04:module1"))
    implementation(project(":module17:module05:module1"))
    implementation(project(":module17:module11:module1"))
    implementation(project(":module17:module11:module2"))
    implementation(project(":module17:module12:module1:module1"))
    implementation(project(":module17:module12:module2:module1"))
    implementation(project(":module17:module12:module3:module1"))
    implementation(project(":module17:module12:module3:module2"))
    implementation(project(":module17:module12:module3:module3"))
    implementation(project(":module17:module13:module1"))
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.lifecycle:lifecycle-common-java8:2.2.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module17.module01.module2"
}
