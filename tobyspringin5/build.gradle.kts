plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.24")
    implementation("mysql:mysql-connector-java:8.0.30")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    implementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    implementation("org.assertj:assertj-core:3.18.1")
    implementation("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
