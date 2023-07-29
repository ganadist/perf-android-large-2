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
    api(project(":module07:module59:module05:module5"))
    api("com.squareup.workflow:workflow-rx2:0.23.2")
    api("javax.inject:javax.inject:1")
    api(libs.kotlin.stdlib)
    implementation(project(":module06:module086:module1"))
    implementation(project(":module06:module157"))
    implementation(project(":module06:module162:module3"))
    implementation(project(":module06:module181:module5"))
    implementation(project(":module06:module224:module6"))
    implementation(project(":module06:module236:module6"))
    implementation(project(":module06:module353:module1"))
    implementation(project(":module07:module59:module01:module1"))
    implementation(project(":module07:module59:module02:module3"))
    implementation(project(":module07:module59:module03:module1"))
    implementation(project(":module07:module59:module05:module5"))
    implementation(project(":module07:module59:module06:module4"))
    implementation(project(":module07:module59:module07:module4"))
    implementation(project(":module07:module59:module17:module3"))
    implementation(project(":module07:module59:module18:module1"))
    implementation(project(":module07:module59:module19:module1"))
    implementation("com.squareup.workflow:workflow-rx2:0.23.2")
    implementation("javax.inject:javax.inject:1")
    implementation(libs.kotlin.android.extensions)
    implementation(libs.kotlin.stdlib)
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module07.module59.module05.module2"
}
