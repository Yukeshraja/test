FROM openjdk:8-jre-alpine
RUN mkdir -p /target
ADD /target/demo-0.0.1-SNAPSHOT.jar // 
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]


