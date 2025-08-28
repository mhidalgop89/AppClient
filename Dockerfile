FROM amazoncorretto:17-alpine
VOLUME /tmp

ADD ./target/AppClient-0.0.1-SNAPSHOT.jar AppClient.jar
ENV server.app.port=8080
ENV DATASOURCE_URL=jdbc:mysql://mysql_db:3306/db_app
ENTRYPOINT ["java","-jar","/AppClient.jar"]