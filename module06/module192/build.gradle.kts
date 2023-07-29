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
    api(project(":module06:module085"))
    api(project(":module06:module155"))
    api(project(":module06:module201:module1"))
    api(project(":module06:module207"))
    api(project(":module06:module342:module3"))
    api(project(":module06:module345"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("com.google.dagger:dagger:2.28")
    api("se.emilsjolander.stickylistheaders:library:2.1.0")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module052"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module155"))
    implementation(project(":module06:module201:module1"))
    implementation(project(":module06:module207"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module342:module3"))
    implementation(project(":module06:module339:module1"))
    implementation(project(":module06:module345"))
    implementation(project(":module15:module36:module1"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.dagger:dagger:2.28")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}")
    implementation("se.emilsjolander.stickylistheaders:library:2.1.0")
    kapt("com.google.dagger:dagger-compiler:2.28")
    testImplementation(project(":module06:module339:module2"))
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("com.google.truth:truth:1.0")
    testImplementation("javax.xml.bind:jaxb-api:2.1")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module192"
}
