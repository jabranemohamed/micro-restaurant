FROM eclipse-temurin:22
RUN mkdir /opt/app
COPY target/*.jar /opt/app/restaurant-service.jar
CMD ["java", "-jar", "/opt/app/restaurant-service.jar"]
