FROM amazoncorretto:17-alpine
VOLUME /tmp

ADD ./target/AppClient-0.0.1-SNAPSHOT.jar AppClient.jar
ENV server.app.port=8080
ENTRYPOINT ["java","-jar","/AppClient.jar"]