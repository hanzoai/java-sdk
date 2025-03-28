import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Hanzo API")
        description.set("Call 100+ LLMs in the OpenAI format. [**Docs**](https://docs.hanzo.ai/)\n\n👉 [`Hanzo Console`](https://cloud.hanzo.ai). Create, Edit API Keys.\n\n💸 [`LLM Models`](https://models.hanzo.ai/).")
        url.set("https://docs.hanzo.ai")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Hanzo")
                email.set("dev@hanzo.ai")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/hanzoai/java-sdk.git")
            developerConnection.set("scm:git:git://github.com/hanzoai/java-sdk.git")
            url.set("https://github.com/hanzoai/java-sdk")
        }
    }
}
