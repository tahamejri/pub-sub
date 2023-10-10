FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pubsub-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pubsub-1.0.0-SNAPSHOT.jar"]