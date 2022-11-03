FROM openjdk:8-jdk-alpine
ADD target/achat.jar achat.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "achat-1.0.jar"]