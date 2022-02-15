FROM openjdk:17-alpine
WORKDIR /demo
COPY . .
RUN cd demo && ./gradlew build
ENTRYPOINT ["java","-jar", "./demo/build/libs/demo-0.0.1-SNAPSHOT.jar"]