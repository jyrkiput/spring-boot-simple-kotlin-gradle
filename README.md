# spring-boot-simple-kotlin-gradle
http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-first-application-code using Kotlin

See https://github.com/gradle/gradle-script-kotlin/tree/master/samples for instructions how to setup Gradle.

    ./gradlew bootRun 
    
should start the application, and 

    curl localhost:8080/greeting
    curl -F "name=me" localhost:8080/greeting
    
should return response.
