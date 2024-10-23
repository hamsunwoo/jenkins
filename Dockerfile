FROM eclipse-temurin:17-jdk-alpine AS build
#FROM openjdk:17-jdk-alpine as build
WORKDIR /land
COPY . .
RUN ./gradlew clean bootJar

#여기서부터 최종이미지로 빌드
#run
FROM eclipse-temurin:17-jre-alpine as run

#위에 build와 맞춰주기
COPY --from=build /land/build/libs/*.jar app.jar
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
