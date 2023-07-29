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
    api(project(":module01:module20"))
    api(project(":module01:module37"))
    api(project(":module06:module018"))
    api(project(":module06:module023"))
    api(project(":module06:module028"))
    api(project(":module06:module057"))
    api(project(":module06:module067"))
    api(project(":module06:module083:module09"))
    api(project(":module06:module094:module3"))
    api(project(":module06:module097:module6"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module134:module7"))
    api(project(":module06:module138:module3"))
    api(project(":module06:module142"))
    api(project(":module06:module151"))
    api(project(":module06:module152"))
    api(project(":module06:module156:module3"))
    api(project(":module06:module161:module3"))
    api(project(":module06:module185:module8"))
    api(project(":module06:module224:module6"))
    api(project(":module06:module243"))
    api(project(":module06:module253"))
    api(project(":module06:module254"))
    api(project(":module06:module260"))
    api(project(":module06:module294:module1"))
    api(project(":module06:module305"))
    api(project(":module06:module306:module5"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module339:module1"))
    api("com.google.dagger:dagger:2.28")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module02"))
    implementation(project(":module01:module20"))
    implementation(project(":module01:module37"))
    implementation(project(":module05:module03:module2"))
    implementation(project(":module06:module013:module6"))
    implementation(project(":module06:module018"))
    implementation(project(":module06:module023"))
    implementation(project(":module06:module028"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module057"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module081"))
    implementation(project(":module06:module083:module09"))
    implementation(project(":module06:module090:module3"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module097:module6"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module127"))
    implementation(project(":module06:module134:module7"))
    implementation(project(":module06:module138:module3"))
    implementation(project(":module06:module142"))
    implementation(project(":module06:module151"))
    implementation(project(":module06:module152"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module161:module3"))
    implementation(project(":module06:module165:module9"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module243"))
    implementation(project(":module06:module253"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module258:module4"))
    implementation(project(":module06:module260"))
    implementation(project(":module06:module279:module1"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module294:module1"))
    implementation(project(":module06:module305"))
    implementation(project(":module06:module306:module5"))
    implementation(project(":module06:module327:module3"))
    implementation(project(":module06:module331"))
    implementation(project(":module06:module333:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module357"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module261"))
    testImplementation(project(":module06:module294:module4"))
    testImplementation(project(":module06:module330"))
    testImplementation(project(":module06:module340:module4"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module05:module2"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("junit:junit:4.13")
    testImplementation(libs.kotlin.test.junit)
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module06.module326"
}
