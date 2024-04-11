FROM eclipse-temurin:22
RUN mkdir /opt/app
COPY target/*.jar /opt/app/orders-service.jar
CMD ["java", "-jar", "/opt/app/orders-service.jar"]
