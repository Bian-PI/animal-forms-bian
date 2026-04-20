FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew && ./gradlew clean bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENV JAVA_TOOL_OPTIONS="-Xmx256m -XX:+UseSerialGC -XX:TieredStopAtLevel=1"
EXPOSE 8089
ENTRYPOINT ["java","-jar","app.jar"]