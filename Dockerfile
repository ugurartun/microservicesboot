FROM java:8
RUN mvn -v
RUN mvn clean install -DskipTests
ADD target/spring-boot-mysql.jar spring-boot-mysql.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "spring-boot-mysql.jar"]

