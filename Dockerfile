FROM openjdk
COPY target/student-app.jar student-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar"]
CMD ["student-app.jar"]