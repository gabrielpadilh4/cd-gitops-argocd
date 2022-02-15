FROM openjdk:17-alpine
WORKDIR /demo
COPY . .
RUN ./demo/gradlew build
RUN ls
ENTRYPOINT ["java","-jar", "./build/libs/demo-0.0.1-SNAPSHOT.jar"]