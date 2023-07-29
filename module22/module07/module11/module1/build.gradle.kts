plugins{
  id("com.android.library")
  id("kotlin-android")
}
            android {
                compileSdk = 29
                defaultConfig {
                    minSdk = 25
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
    annotationProcessor("com.uber.nullaway:nullaway:0.7.2")
    api(project(":module01:module04"))
    api(project(":module01:module21"))
    api(project(":module01:module39"))
    api(project(":module01:module40"))
    api(project(":module06:module034:module3"))
    api(project(":module06:module094:module3"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module139"))
    api(project(":module06:module141:module1:module13"))
    api(project(":module06:module162:module3"))
    api(project(":module06:module187:module5"))
    api(project(":module06:module196:module4"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module358"))
    api(project(":module07:module60"))
    api(project(":module07:module63"))
    api(project(":module15:module36:module1"))
    api(project(":module15:module56:module1"))
    api(project(":module22:module01:module02"))
    api(project(":module22:module01:module04:module3"))
    api(project(":module22:module01:module10"))
    api(project(":module22:module01:module25"))
    api(project(":module22:module01:module31"))
    api(project(":module22:module01:module33"))
    api(project(":module22:module01:module35"))
    api(project(":module22:module01:module36"))
    api(project(":module22:module07:module01:module1"))
    api(project(":module22:module07:module03:module1"))
    api(project(":module22:module07:module05:module1"))
    api(project(":module22:module07:module13"))
    api(project(":module22:module07:module11:module3"))
    api(project(":module22:module07:module28"))
    api(project(":module22:module07:module33:module1"))
    api("com.google.dagger:dagger:2.28")
    api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    api("com.squareup.picasso:picasso:2.5.2")
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("javax.inject:javax.inject:1")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module04"))
    implementation(project(":module01:module13"))
    implementation(project(":module01:module21"))
    implementation(project(":module01:module23"))
    implementation(project(":module01:module39"))
    implementation(project(":module01:module40"))
    implementation(project(":module04:module11:module3"))
    implementation(project(":module05:module15:module3"))
    implementation(project(":module06:module030"))
    implementation(project(":module06:module032"))
    implementation(project(":module06:module034:module3"))
    implementation(project(":module06:module045"))
    implementation(project(":module06:module048"))
    implementation(project(":module06:module095"))
    implementation(project(":module06:module094:module3"))
    implementation(project(":module06:module105"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module122:module4"))
    implementation(project(":module06:module133:module1"))
    implementation(project(":module06:module135"))
    implementation(project(":module06:module139"))
    implementation(project(":module06:module141:module1:module13"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module179:module1"))
    implementation(project(":module06:module178:module6"))
    implementation(project(":module06:module187:module5"))
    implementation(project(":module06:module196:module4"))
    implementation(project(":module06:module216"))
    implementation(project(":module06:module232"))
    implementation(project(":module06:module250:module4"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module280:module1"))
    implementation(project(":module06:module306:module5"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module358"))
    implementation(project(":module07:module14"))
    implementation(project(":module07:module58"))
    implementation(project(":module07:module60"))
    implementation(project(":module07:module63"))
    implementation(project(":module07:module82"))
    implementation(project(":module07:module83"))
    implementation(project(":module09:module5"))
    implementation(project(":module10"))
    implementation(project(":module15:module36:module1"))
    implementation(project(":module15:module56:module1"))
    implementation(project(":module22:module01:module02"))
    implementation(project(":module22:module01:module04:module3"))
    implementation(project(":module22:module01:module06:module3"))
    implementation(project(":module22:module01:module07:module3"))
    implementation(project(":module22:module01:module10"))
    implementation(project(":module22:module01:module25"))
    implementation(project(":module22:module01:module31"))
    implementation(project(":module22:module01:module33"))
    implementation(project(":module22:module01:module35"))
    implementation(project(":module22:module01:module36"))
    implementation(project(":module22:module07:module01:module1"))
    implementation(project(":module22:module07:module02:module5"))
    implementation(project(":module22:module07:module04:module3"))
    implementation(project(":module22:module07:module03:module1"))
    implementation(project(":module22:module07:module05:module1"))
    implementation(project(":module22:module07:module12:module5"))
    implementation(project(":module22:module07:module13"))
    implementation(project(":module22:module07:module11:module3"))
    implementation(project(":module22:module07:module20:module3"))
    implementation(project(":module22:module07:module25"))
    implementation(project(":module22:module07:module28"))
    implementation(project(":module22:module07:module33:module1"))
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("com.squareup.workflow:workflow-core-jvm:0.23.2")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("javax.inject:javax.inject:1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.3.7")
    testImplementation(project(":module05:module14:module1:module4"))
    testImplementation(project(":module06:module044:module1"))
    testImplementation(project(":module06:module069"))
    testImplementation(project(":module06:module083:module10"))
    testImplementation(project(":module06:module089"))
    testImplementation(project(":module06:module185:module9"))
    testImplementation(project(":module06:module197:module1"))
    testImplementation(project(":module06:module245"))
    testImplementation(project(":module06:module255"))
    testImplementation(project(":module06:module282:module2"))
    testImplementation(project(":module06:module295:module7"))
    testImplementation(project(":module06:module342:module4"))
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation(project(":module15:module36:module1"))
    testImplementation("com.github.akarnokd:rxjava2-interop:0.13.5")
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("com.squareup.workflow:workflow-testing-jvm:0.23.2")
    testImplementation("junit:junit:4.13")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.72")
    testImplementation("org.mockito:mockito-core:2.28.2")
}

android {
    namespace = "pkg.android.module22.module07.module11.module1"
}