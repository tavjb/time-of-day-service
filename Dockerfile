FROM openjdk:17-alpine

COPY /target/time-of-day-service-0.0.1-SNAPSHOT.jar /
ENTRYPOINT  java -jar /time-of-day-service-0.0.1-SNAPSHOT.jar