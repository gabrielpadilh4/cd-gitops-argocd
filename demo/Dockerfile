FROM openjdk:17-alpine
WORKDIR /app
COPY . .
RUN ls
ENTRYPOINT ["java","-jar", "./build/libs/demo-0.0.1-SNAPSHOT.jar"]