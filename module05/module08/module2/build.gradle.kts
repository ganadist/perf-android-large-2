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
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module06"))
    implementation(project(":module01:module23"))
    implementation(project(":module01:module35"))
    implementation(project(":module01:module40"))
    implementation(project(":module04:module20"))
    implementation(project(":module05:module01:module10:module5"))
    implementation(project(":module05:module09:module3"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module025:module2"))
    implementation(project(":module06:module044:module2"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module126"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module150"))
    implementation(project(":module06:module154"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module192"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module294:module3"))
    implementation(project(":module06:module298:module3"))
    implementation(project(":module06:module314:module5"))
    implementation(project(":module06:module320:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module357"))
    implementation(project(":module15:module21:module1"))
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module05.module08.module2"
}