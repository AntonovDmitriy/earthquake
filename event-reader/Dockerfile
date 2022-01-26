FROM openjdk:11
COPY ./target/event-reader-0.0.1-SNAPSHOT.jar /app/event-reader-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","event-reader-0.0.1-SNAPSHOT.jar"]