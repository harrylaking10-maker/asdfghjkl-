plugins {
    id 'java'
    id 'com.github.johnrengelman.shadow' version '8.1.1'
}

group = 'com.example'
version = '1.0'

repositories {
    mavenCentral()
    maven {
        url 'https://repo.papermc.io/repository/maven-public/'
    }
}

dependencies {
    compileOnly 'io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT'
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

jar {
    archiveFileName = 'MyPlugin.jar'
}

shadowJar {
    archiveFileName = 'MyPlugin.jar'
}