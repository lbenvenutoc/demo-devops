FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

COPY build/libs/demo-devops-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-XX:+UseContainerSupport","-XX:MaxRAMPercentage=75.0","-jar","app.jar"]