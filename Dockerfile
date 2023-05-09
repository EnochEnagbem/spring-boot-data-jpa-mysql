FROM adoptopenjdk/openjdk11:alpine-jre
RUN mkdir /app
COPY target/spring-boot-data-jpa-1.jar /app/
WORKDIR /app
CMD ["java", "-jar", "spring-boot-data-jpa-1.jar"]
