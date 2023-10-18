# Use an official OpenJDK image as the base image
FROM  openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app
# Copy the packaged Spring Boot JAR file into the container
COPY target/simi-aquatech-jar-with-dependencies.jar app.jar
EXPOSE 43275

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

#docker build --pull --rm -f "Dockerfile" -t subscriberservice/v2.1 "."
