FROM maven:3.6.2-jdk-8-slim AS build
WORKDIR /workdir
COPY . .
RUN mvn clean package

FROM openjdk:8-jdk
COPY --from=build /workdir/target/greeting-service.jar /
EXPOSE 8181
CMD ["java", "-jar", "/greeting-service.jar"]
