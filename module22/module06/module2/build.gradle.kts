plugins{
  id("com.android.library")
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
    
}
dependencies {
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    api(project(":module01:module05"))
    api(project(":module01:module07"))
    api(project(":module01:module08"))
    api(project(":module01:module21"))
    api(project(":module01:module32"))
    api(project(":module03:module08:module1:module2"))
    api(project(":module04:module18:module3"))
    api(project(":module06:module002:module3"))
    api(project(":module06:module005:module3"))
    api(project(":module06:module042:module3"))
    api(project(":module06:module045"))
    api(project(":module06:module061:module4"))
    api(project(":module06:module062:module2"))
    api(project(":module06:module072:module4"))
    api(project(":module06:module073:module5"))
    api(project(":module06:module100:module3"))
    api(project(":module06:module104"))
    api(project(":module06:module097:module4"))
    api(project(":module06:module121:module2"))
    api(project(":module06:module129:module3"))
    api(project(":module06:module147:module4:module4"))
    api(project(":module06:module165:module6"))
    api(project(":module06:module187:module3"))
    api(project(":module06:module185:module5"))
    api(project(":module06:module262:module4"))
    api(project(":module06:module274:module4"))
    api(project(":module06:module277:module3"))
    api(project(":module06:module300"))
    api(project(":module06:module302"))
    api(project(":module06:module312:module2"))
    api(project(":module06:module314:module3"))
    api(project(":module06:module324:module3"))
    api(project(":module07:module01"))
    api(project(":module07:module08:module5"))
    api(project(":module07:module16"))
    api(project(":module07:module36"))
    api(project(":module07:module58"))
    api(project(":module07:module75"))
    api(project(":module07:module77:module4"))
    api(project(":module07:module79"))
    api(project(":module09:module3"))
    api(project(":module10"))
    api(project(":module14:module1"))
    api(project(":module22:module01:module20:module1"))
    api(project(":module22:module01:module22:module2"))
    api(project(":module22:module01:module26"))
    api(project(":module22:module01:module28:module3"))
    api(project(":module22:module01:module39"))
    api(project(":module22:module06:module4:module2"))
    api(project(":module22:module06:module7:module2"))
    api(project(":module22:module04:module01"))
    api(project(":module22:module04:module03"))
    api(project(":module22:module04:module05"))
    api(project(":module22:module04:module08"))
    api(project(":module22:module04:module09"))
    api(project(":module22:module04:module11"))
    api(project(":module22:module04:module15:module4"))
    api("com.google.dagger:dagger:2.28")
    compileOnly(project(":module06:module232"))
    compileOnly(project(":module06:module240"))
    compileOnly(project(":module06:module252"))
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    compileOnly("javax.annotation:jsr250-api:1.0")
    implementation(project(":module01:module05"))
    implementation(project(":module01:module07"))
    implementation(project(":module01:module08"))
    implementation(project(":module01:module21"))
    implementation(project(":module01:module32"))
    implementation(project(":module03:module08:module1:module2"))
    implementation(project(":module04:module18:module3"))
    implementation(project(":module06:module002:module3"))
    implementation(project(":module06:module005:module3"))
    implementation(project(":module06:module042:module3"))
    implementation(project(":module06:module045"))
    implementation(project(":module06:module061:module4"))
    implementation(project(":module06:module062:module2"))
    implementation(project(":module06:module072:module4"))
    implementation(project(":module06:module073:module5"))
    implementation(project(":module06:module100:module3"))
    implementation(project(":module06:module104"))
    implementation(project(":module06:module097:module4"))
    implementation(project(":module06:module121:module2"))
    implementation(project(":module06:module129:module3"))
    implementation(project(":module06:module147:module4:module4"))
    implementation(project(":module06:module165:module6"))
    implementation(project(":module06:module187:module3"))
    implementation(project(":module06:module185:module5"))
    implementation(project(":module06:module262:module4"))
    implementation(project(":module06:module274:module4"))
    implementation(project(":module06:module277:module3"))
    implementation(project(":module06:module300"))
    implementation(project(":module06:module302"))
    implementation(project(":module06:module312:module2"))
    implementation(project(":module06:module314:module3"))
    implementation(project(":module06:module324:module3"))
    implementation(project(":module07:module01"))
    implementation(project(":module07:module08:module5"))
    implementation(project(":module07:module16"))
    implementation(project(":module07:module36"))
    implementation(project(":module07:module58"))
    implementation(project(":module07:module75"))
    implementation(project(":module07:module77:module4"))
    implementation(project(":module07:module79"))
    implementation(project(":module09:module3"))
    implementation(project(":module10"))
    implementation(project(":module14:module1"))
    implementation(project(":module22:module01:module20:module1"))
    implementation(project(":module22:module01:module22:module2"))
    implementation(project(":module22:module01:module26"))
    implementation(project(":module22:module01:module28:module3"))
    implementation(project(":module22:module01:module39"))
    implementation(project(":module22:module06:module4:module2"))
    implementation(project(":module22:module06:module7:module2"))
    implementation(project(":module22:module04:module01"))
    implementation(project(":module22:module04:module03"))
    implementation(project(":module22:module04:module05"))
    implementation(project(":module22:module04:module08"))
    implementation(project(":module22:module04:module09"))
    implementation(project(":module22:module04:module11"))
    implementation(project(":module22:module04:module15:module4"))
    implementation("com.google.dagger:dagger:2.28")
    testImplementation(project(":module06:module339:module3:module1"))
}

android {
    namespace = "pkg.android.module22.module06.module2"
}