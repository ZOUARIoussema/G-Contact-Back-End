FROM openjdk:8-jdk-alpine
Volume /tmp
ADD target/contact*.jar /app.jar
CMD ["java", "-jar", "/app.jar", "--spring.profiles.active=prod"]
EXPOSE 8082
