FROM openjdk:11
ADD /client2-0.0.1-SNAPSHOT.jar client2.jar
ENTRYPOINT ["java", "-jar", "client2.jar"]