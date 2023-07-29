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
    api(project(":module06:module139"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module190:module5"))
    api(project(":module06:module267:module1"))
    api(project(":module06:module288"))
    api(project(":module06:module317"))
    api(project(":module07:module10:module5"))
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module01:module31"))
    implementation(project(":module06:module011"))
    implementation(project(":module06:module012:module5"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module044:module2"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module139"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module147:module4:module6"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module164:module6"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module190:module5"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module06:module288"))
    implementation(project(":module06:module317"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module353:module3"))
    implementation(project(":module06:module353:module5"))
    implementation(project(":module07:module08:module8"))
    implementation(project(":module07:module09:module5"))
    implementation(project(":module07:module10:module5"))
    implementation(project(":module15:module36:module1"))
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module005:module5"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module280:module2"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module294:module3"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module07:module10:module6"))
    testImplementation(project(":module15:module36:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.okio:okio:2.2.2")
    testImplementation("com.squareup.workflow:legacy-workflow-test:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.threeten:threetenbp:1.4.0")
}

android {
    namespace = "pkg.android.module07.module10.module2"
}
