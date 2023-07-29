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
    api(project(":module06:module004:module1"))
    api(project(":module06:module067"))
    api(project(":module06:module073:module7"))
    api(project(":module06:module093:module1"))
    api(project(":module06:module109:module1"))
    api(project(":module06:module185:module1"))
    api(project(":module06:module238:module5"))
    api(project(":module06:module254"))
    api(project(":module06:module297:module1"))
    api(project(":module06:module297:module4"))
    api(project(":module06:module295:module1"))
    api(project(":module06:module342:module3"))
    api("com.google.code.gson:gson:2.8.5")
    api("com.google.dagger:dagger:2.28")
    api("com.nimbusds:nimbus-jose-jwt:3.10")
    api("com.squareup.retrofit2:retrofit-mock:2.7.2")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    api("com.squareup.wire:wire-runtime:3.0.0")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api(libs.kotlin.stdlib)
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module004:module1"))
    implementation(project(":module06:module067"))
    implementation(project(":module06:module073:module7"))
    implementation(project(":module06:module093:module1"))
    implementation(project(":module06:module109:module1"))
    implementation(project(":module06:module156:module3"))
    implementation(project(":module06:module167"))
    implementation(project(":module06:module185:module1"))
    implementation(project(":module06:module185:module8"))
    implementation(project(":module06:module238:module5"))
    implementation(project(":module06:module254"))
    implementation(project(":module06:module297:module1"))
    implementation(project(":module06:module297:module4"))
    implementation(project(":module06:module295:module1"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module15:module36:module1"))
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.dagger:dagger:2.28")
    implementation("com.nimbusds:nimbus-jose-jwt:3.10")
    implementation("com.squareup.okio:okio:2.2.2")
    implementation("com.squareup.retrofit2:retrofit-mock:2.7.2")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.wire:wire-runtime:3.0.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation(libs.kotlin.stdlib)
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module06.module297.module2"
}
