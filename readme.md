# Distributed-Tracing

This implementation contain two services order-service which calls the inventory-service.

## Build and Run
### 1.Run order-service
Go to /order-service directory and run.

    mvn clean install
    java -jar target/order-service-0.0.1-SNAPSHOT.jar

### 2.Run inventory-service
Go to /inventory-service directory and run.

    mvn clean install
    java -jar target/inventory-service-0.0.1-SNAPSHOT.jar 

### 3.Spin up Zipkin instance
You can spin up the Zipkin instance using three options: using Java, Docker, or running from source. In this demo, I prefer to fetch the latest release as a self-contained executable jar.

    curl -sSL https://zipkin.io/quickstart.sh | bash -s  
    java -jar zipkin.jar

## Tracing the Request
Once spin up all three services. You can run the GET request and see how request trace via Zipkin visualization tool.

### 1.Execute GET request

    curl --location 'http://localhost:8080/order/health'

### 2.Access to Zipkin instane
End Point : `http://localhost:9411/`