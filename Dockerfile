FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/spring_boot_docker.jar spring_boot_docker_fun.jar
ENTRYPOINT ["java","-jar","spring-boot-docker-1.0.jar"]
