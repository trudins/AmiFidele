FROM openjdk:8
EXPOSE 8080
ADD target/bddamifidele-integration.jar bddamifidele-integration.jar
ENTRYPOINT [ "java",".jar","bddamifidele-integration.jar" ]