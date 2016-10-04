import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.wrapper.*

buildscript {

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.4.1.RELEASE")
    }
}

apply<JavaPlugin>()

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
}

apply {
    plugin("idea")
    plugin("spring-boot")
}

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Jar>() {
    baseName = "spring-boot-sample-simple"
    version =  "0.0.0"
}

tasks.withType<Wrapper> {
    gradleVersion = "3.1"
    distributionType = Wrapper.DistributionType.ALL
}
