plugins {
    id("hanzo.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":hanzo-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "ai.hanzo.api.example.Main"
}
