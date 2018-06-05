FROM java:8
EXPOSE 5555:5555
ADD /target/springboot-API-docker.jar springboot-API-docker.jar
ENTRYPOINT ["java","-jar","springboot-API-docker.jar"]