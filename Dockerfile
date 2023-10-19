FROM openjdk

MAINTAINER manu

WORKDIR /app

COPY target/Phone-Book-0.0.1-SNAPSHOT.jar /app/Phone-Book-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "Phone-Book-0.0.1-SNAPSHOT.jar"]
