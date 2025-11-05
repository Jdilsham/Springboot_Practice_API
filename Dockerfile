#Use maven to build the jar
FROM maven:3.9-eclipse-temurin-21 AS build

#Create a folder inside the container called /app
WORKDIR /app

#Copy project pom.xml file into the container’s /app folder
COPY pom.xml .

#Download dependencies
RUN mvn dependency:go-offline -B

#Copy project src file into the container’s /app/src folder
COPY src ./src

#Build the project inside container
RUN mvn package -DskipTests

#Start a new lightweight image with Java 21
FROM eclipse-temurin:21-jdk

WORKDIR /app

#Copy the built JAR from the build stage into this container
COPY --from=build /app/target/*.jar app.jar

#Tells Docker that the app listens on port 8080
EXPOSE 8080

#Command that runs when container starts
ENTRYPOINT ["java", "-jar", "app.jar"]