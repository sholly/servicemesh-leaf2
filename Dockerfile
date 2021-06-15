FROM openjdk:11
RUN mkdir -p /deployments/config &&  \
    chown -R 1001:0 /deployments/ && \
    chmod -R 775 /deployments/
ADD target/servicemesh-leaf2.jar /deployments/servicemesh-leaf2.jar
WORKDIR /deployments
USER 1001
EXPOSE 8082
ENTRYPOINT ["java","-jar", "/deployments/servicemesh-leaf2.jar"]
