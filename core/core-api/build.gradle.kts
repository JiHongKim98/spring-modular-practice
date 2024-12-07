dependencies {
    implementation(project(":core:core-domain"))
    implementation(project(":infra:storage"))
    runtimeOnly(project(":support:logging"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
