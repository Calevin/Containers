FROM maven:3.5-jdk-11 AS dependencies
ENV SPRING_PROFILES_ACTIVE=prod
VOLUME "$HOME/.m2":/root/.m2

COPY pom.xml /tmp/

RUN mvn -B dependency:go-offline -f /tmp/pom.xml -s /usr/share/maven/ref/settings-docker.xml

FROM dependencies as build

COPY src /tmp/src/

RUN mvn -DskipTests=true -B -s /usr/share/maven/ref/settings-docker.xml clean package -f /tmp/

FROM openjdk:11-jdk-slim

EXPOSE 80

COPY --from=build /tmp/target/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod","-jar","/app/spring-boot-application.jar"]