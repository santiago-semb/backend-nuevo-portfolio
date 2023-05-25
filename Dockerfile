FROM amazoncorretto:9-alpine-jdk

MAINTAINER sansembbb

COPY target/portfoliosan-0.0.1-SNAPSHOT.jar portfoliosan-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfoliosan-0.0.1-SNAPSHOT.jar"]
