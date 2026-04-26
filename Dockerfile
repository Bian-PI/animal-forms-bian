FROM gradle:8.14-jdk17-alpine AS build
WORKDIR /app
COPY . .
RUN gradle clean bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENV JAVA_TOOL_OPTIONS="-Xmx256m -XX:+UseSerialGC -XX:TieredStopAtLevel=1"
EXPOSE 8089
ENTRYPOINT ["java","-jar","app.jar"]