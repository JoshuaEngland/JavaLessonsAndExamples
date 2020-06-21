plugins {
    java
}

group = "io.joshuaengland"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    testAnnotationProcessor("org.fluentlenium", "fluentlenium-core", "4.3.1")
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.6.2")
    testImplementation("org.fluentlenium", "fluentlenium-junit-jupiter", "4.3.1")
    testImplementation("org.fluentlenium", "fluentlenium-assertj", "4.3.1")
    testImplementation("org.seleniumhq.selenium", "htmlunit-driver", "2.34.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
