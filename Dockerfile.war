# Stage 1: Build WAR bằng Maven
FROM maven:3.9.8-eclipse-temurin-21 AS builder
WORKDIR /app

COPY pom.xml .
COPY src ./src

# Build file WAR
RUN mvn clean package -DskipTests

FROM tomcat:10.1-jdk21

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
