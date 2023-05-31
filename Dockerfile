FROM openjdk:8
EXPOSE 8080
ADD target/BddAmiFidele-integration.jar BddAmiFidele-integration.jar
ENTRYPOINT [ "java",".jar","BddAmiFidele-integration.jar" ]