plugins {
    kotlin("jvm") version "1.9.22"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
    testImplementation("org.testng:testng:7.9.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.0.3")
}

tasks.test {
    useTestNG()
}
kotlin {
    jvmToolchain(21)
}