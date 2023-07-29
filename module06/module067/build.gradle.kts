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
    api(project(":module01:module16"))
    api(project(":module05:module03:module2"))
    api(project(":module06:module073:module7"))
    api(project(":module06:module097:module6"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module192"))
    api(project(":module06:module224:module2"))
    api(project(":module06:module231"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api(project(":module15:module31:module1"))
    api(project(":module15:module40:module1"))
    api("com.google.code.gson:gson:2.8.5")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module16"))
    implementation(project(":module05:module03:module2"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module130:module3"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module224:module2"))
    implementation(project(":module06:module224:module3"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module231"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module343"))
    implementation(project(":module15:module31:module1"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module40:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.squareup.ui.resources:resources-truth:0.1.11")
    testImplementation("javax.xml.bind:jaxb-api:2.1")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module067"
}