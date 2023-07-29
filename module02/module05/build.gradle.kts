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
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module03:module01:module1:module1"))
    compileOnly(project(":module01:module08"))
    compileOnly(project(":module02:module20"))
    compileOnly(project(":module02:module27"))
    compileOnly(project(":module02:module40"))
    compileOnly(project(":module02:module44"))
    compileOnly(project(":module06:module232"))
    compileOnly(project(":module06:module240"))
    compileOnly(project(":module06:module252"))
    compileOnly(project(":module07:module36"))
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module01:module09"))
    implementation(project(":module02:module03"))
    implementation(project(":module02:module06"))
    implementation(project(":module02:module09:module3"))
    implementation(project(":module02:module11"))
    implementation(project(":module02:module12"))
    implementation(project(":module02:module13:module2"))
    implementation(project(":module02:module17"))
    implementation(project(":module02:module19"))
    implementation(project(":module02:module25:module2"))
    implementation(project(":module02:module28:module2"))
    implementation(project(":module02:module29"))
    implementation(project(":module02:module34:module4"))
    implementation(project(":module02:module35"))
    implementation(project(":module02:module37:module31"))
    implementation(project(":module02:module37:module34"))
    implementation(project(":module02:module37:module35"))
    implementation(project(":module02:module39"))
    implementation(project(":module02:module38:module3"))
    implementation(project(":module02:module42:module4"))
    implementation(project(":module02:module45"))
    implementation(project(":module03:module01:module1:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module147:module3"))
    implementation(project(":module06:module300"))
    implementation(project(":module06:module302"))
    implementation(project(":module07:module01"))
    implementation(project(":module07:module26"))
    implementation(project(":module07:module58"))
    implementation(project(":module14:module2"))
    implementation("androidx.sqlite:sqlite:2.0.1")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module02.module05"
}
