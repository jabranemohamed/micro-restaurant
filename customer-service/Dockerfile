FROM eclipse-temurin:22
RUN mkdir /opt/app
COPY target/*.jar /opt/app/customer-service.jar
CMD ["java", "-jar", "/opt/app/customer-service.jar"]
