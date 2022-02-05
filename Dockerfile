FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-git-jenkin-docker.jar spring-boot-git-jenkin-docker.jar
ENTRYPOINT ["java","-jar", "/spring-boot-git-jenkin-docker.jar"]