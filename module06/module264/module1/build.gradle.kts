plugins{
  id("com.android.application")
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
    androidTestImplementation(project(":module06:module061:module2"))
    androidTestImplementation(project(":module06:module119:module7"))
    androidTestImplementation(project(":module06:module143:module3"))
    androidTestImplementation(project(":module06:module263:module2"))
    androidTestImplementation(project(":module06:module264:module5"))
    androidTestImplementation(project(":module06:module335:module1"))
    androidTestImplementation(project(":module15:module25:module1"))
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("com.google.dagger:dagger:2.28")
    androidTestImplementation("junit:junit:4.13")
    api(project(":module06:module086:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module254"))
    api(project(":module06:module264:module7"))
    api(project(":module06:module320:module1"))
    api(project(":module06:module333:module4"))
    api(project(":module06:module353:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.squareup.hephaestus:annotations:1.0.0")
    api("com.squareup.workflow:workflow-core-jvm:0.23.2")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module013:module4"))
    implementation(project(":module06:module017:module5"))
    implementation(project(":module06:module061:module4"))
    implementation(project(":module06:module073:module6"))
    implementation(project(":module06:module084"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module119:module8"))
    implementation(project(":module06:module143:module4"))
    implementation(project(":module06:module172:module5"))
    implementation(project(":module06:module200:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module263:module3"))
    implementation(project(":module06:module264:module6"))
    implementation(project(":module06:module264:module7"))
    implementation(project(":module06:module262:module5"))
    implementation(project(":module06:module297:module2"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module334:module2"))
    implementation(project(":module06:module333:module4"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module353:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.hephaestus:annotations:1.0.0")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.squareup.workflow:workflow-internal-testing-utils:0.23.2")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
}

android {
    namespace = "pkg.android.module06.module264.module1"
}
