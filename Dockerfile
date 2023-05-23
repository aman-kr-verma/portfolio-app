FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/my-application.jar .
EXPOSE 8080
CMD ["java", "-jar", "my-application.jar"]
