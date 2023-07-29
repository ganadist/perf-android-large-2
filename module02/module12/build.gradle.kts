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
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    compileOnly(project(":module06:module240"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module05"))
    implementation(project(":module02:module09:module3"))
    implementation(project(":module02:module10:module3"))
    implementation(project(":module02:module11"))
    implementation(project(":module02:module22:module4"))
    implementation(project(":module02:module34:module4"))
    implementation(project(":module02:module37:module02:module3"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module34"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module02:module38:module3"))
    implementation(project(":module02:module45"))
    implementation(project(":module02:module46:module1"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module045"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module074:module7"))
    implementation(project(":module06:module077"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module088:module1"))
    implementation(project(":module06:module100:module3"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module149"))
    implementation(project(":module06:module177"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module226"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module07:module60"))
    implementation(project(":module07:module77:module7"))
    implementation(project(":module09:module4"))
    implementation(project(":module10"))
    implementation(project(":module15:module05:module2"))
    implementation(project(":module15:module56:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module073:module8"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module02.module12"
}