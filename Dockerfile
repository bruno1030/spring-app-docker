FROM openjdk

WORKDIR /app

EXPOSE 8080

COPY target/spring-app-docker-0.0.1-SNAPSHOT.jar /app/spring-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]

