FROM eclipse-temurin:17

RUN mkdir /backend
WORKDIR /backend

COPY . .
#COPY /build/libs/backend-0.0.1-SNAPSHOT.jar /backend/

EXPOSE 8080
#RUN java --jar /backend/build/libs/backend-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/backend/build/libs/backend-0.0.1-SNAPSHOT.jar"]
