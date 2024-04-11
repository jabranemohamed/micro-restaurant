FROM eclipse-temurin:22
RUN mkdir /opt/app
EXPOSE 8761
COPY target/*.jar /opt/app/eureka-server.jar
CMD ["java", "-jar", "/opt/app/eureka-server.jar"]
