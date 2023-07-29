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
    api(project(":module06:module178:module6"))
    api("com.google.dagger:dagger:2.28")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module06"))
    implementation(project(":module01:module38"))
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module028"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module110"))
    implementation(project(":module06:module113:module6"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module211:module1"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module267:module1"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    testImplementation(project(":module06:module029"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module097:module7"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module321:module11"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module102"
}
