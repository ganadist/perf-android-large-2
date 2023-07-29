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
    api(project(":module06:module085"))
    api(project(":module06:module114"))
    api(project(":module06:module194"))
    api(project(":module06:module276:module1"))
    api(project(":module06:module343"))
    api(project(":module06:module345"))
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.constraintlayout:constraintlayout:1.1.3")
    api("androidx.transition:transition:1.2.0")
    api("com.jakewharton.threetenabp:threetenabp:1.2.1")
    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("androidx.annotation:annotation:1.1.0")
    compileOnly("org.jetbrains:annotations:13.0")
    implementation(project(":module06:module002:module5"))
    implementation(project(":module06:module085"))
    implementation(project(":module06:module114"))
    implementation(project(":module06:module194"))
    implementation(project(":module06:module276:module1"))
    implementation(project(":module06:module281:module1"))
    implementation(project(":module06:module337:module3"))
    implementation(project(":module06:module343"))
    implementation(project(":module06:module345"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.transition:transition:1.2.0")
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.1")
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("com.squareup.workflow:workflow-ui-core-android:0.23.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-android-extensions-runtime:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    testImplementation(project(":module06:module339:module3:module1"))
    testImplementation("javax.xml.bind:jaxb-api:2.1")
    testImplementation("junit:junit:4.13")
}

android {
    namespace = "pkg.android.module06.module207"
}