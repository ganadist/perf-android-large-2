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
    api(project(":module01:module22"))
    api(project(":module06:module067"))
    api(project(":module06:module114"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module151"))
    api(project(":module06:module155"))
    api(project(":module06:module157"))
    api(project(":module06:module166:module3"))
    api(project(":module06:module178:module6"))
    api(project(":module06:module192"))
    api(project(":module06:module194"))
    api(project(":module06:module207"))
    api(project(":module06:module211:module1"))
    api(project(":module06:module224:module2"))
    api(project(":module06:module230:module2"))
    api(project(":module06:module243"))
    api(project(":module06:module254"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module275:module3"))
    api(project(":module06:module326"))
    api(project(":module06:module333:module5"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module345"))
    api(project(":module06:module348"))
    api(project(":module06:module353:module1"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module22"))
    implementation(project(":module04:module19:module6"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module151"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module166:module3"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module224:module2"))
    implementation(project(":module06:module230:module2"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module275:module3"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module353:module1"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module130:module1"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module077"
}
