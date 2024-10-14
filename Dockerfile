FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar project-retail-store-sb-restful-hateoas-hiber-sec-mysql-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","project-retail-store-sb-restful-hateoas-hiber-sec-mysql-0.0.1-SNAPSHOT.jar"]