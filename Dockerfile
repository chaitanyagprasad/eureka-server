FROM openjdk:21
MAINTAINER CHAITANYAGP
COPY target/eureka-service-registry-0.0.1-SNAPSHOT.jar eureka-service-registry-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/eureka-service-registry-0.0.1-SNAPSHOT.jar"]