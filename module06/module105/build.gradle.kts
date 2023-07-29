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
    api(project(":module06:module030"))
    api(project(":module06:module042:module5"))
    api(project(":module06:module045"))
    api(project(":module06:module098"))
    api(project(":module06:module100:module3"))
    api(project(":module06:module102"))
    api(project(":module06:module097:module5"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module167"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module250:module4"))
    api(project(":module06:module252"))
    api(project(":module06:module317"))
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module05"))
    implementation(project(":module01:module06"))
    implementation(project(":module01:module08"))
    implementation(project(":module01:module21"))
    implementation(project(":module01:module22"))
    implementation(project(":module01:module38"))
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module018"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module031:module3"))
    implementation(project(":module06:module042:module5"))
    implementation(project(":module06:module045"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module051"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module098"))
    implementation(project(":module06:module100:module3"))
    implementation(project(":module06:module100:module4"))
    implementation(project(":module06:module102"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module097:module5"))
    implementation(project(":module06:module126"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module146"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module210:module1"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module240"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module252"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module266"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module317"))
    implementation(project(":module06:module322:module1"))
    implementation(project(":module06:module326"))
    implementation(project(":module06:module345"))
    implementation(project(":module06:module348"))
    implementation(project(":module06:module358"))
    implementation(project(":module15:module56:module1"))
    implementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module097:module7"))
    testImplementation(project(":module06:module134:module8"))
    testImplementation(project(":module06:module185:module9"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module297:module1"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module298:module4"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation("junit:junit:4.13")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.robolectric:robolectric:4.3")
}

android {
    namespace = "pkg.android.module06.module105"
}
