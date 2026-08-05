# Stage 1: Build the application using Maven
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

COPY target/*.jar app.jar

# Expose port and run the app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]