FROM java:8-jdk-alpine
COPY ./target/demo-0.0.1-SNAPSHOT.jar /usr/application/
WORKDIR /usr/application
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
