plugins{
  id("com.android.library")
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
    
}
dependencies {
    api(project(":module06:module162:module3"))
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation(project(":module01:module39"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module091:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module113:module6"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module15:module56:module1"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    testImplementation(project(":module06:module013:module3"))
    testImplementation(project(":module06:module050"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module199:module1"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module045"
}