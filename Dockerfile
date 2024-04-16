FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD /home/runner/work/tech-challenge-02/tech-challenge-02/target/techchallenge-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
