FROM bitnami/java:17

EXPOSE 8080

WORKDIR /app

COPY /build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "./demo-0.0.1-SNAPSHOT.jar"]
