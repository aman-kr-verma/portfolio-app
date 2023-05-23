FROM openjdk:17
WORKDIR /home/ubuntu/projects/portfolio-app
COPY target/portfolio.jar .
EXPOSE 8080
CMD ["java", "-jar", "portfolio.jar"]
