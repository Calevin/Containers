FROM maven:3.5-jdk-11 AS dependencies

COPY pom.xml /tmp/

RUN mvn -B dependency:go-offline -f /tmp/pom.xml

FROM dependencies as build

COPY src /tmp/src/

RUN mvn -B clean package -f /tmp/

FROM openjdk:11-jdk-slim

EXPOSE 80

COPY --from=build /tmp/target/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]