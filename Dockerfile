FROM openjdk:17
ADD target/spring-boot-crud-k8s-0.0.1-SNAPSHOT.jar spring-boot-crud-k8s.jar
ENTRYPOINT ["java", "-jar","spring-boot-crud-k8s.jar"]
EXPOSE 8099
