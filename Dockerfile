FROM openjdk:11-jre-slim
WORKDIR /home/ubuntu/projects/portfolio-app
COPY target/portfolio.jar .
EXPOSE 8080
CMD ["java", "-jar", "portfolio.jar"]
