FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD  ${JAR_FILE} spring_boot_docker_fun.jar
ENTRYPOINT ["java","-jar","spring-boot-docker-1.0.jar"]
