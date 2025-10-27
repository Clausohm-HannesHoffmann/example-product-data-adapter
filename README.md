# Product Data Adapter 
The Product Data Adapter is a worker service executing product logic.

Holds two modules to separate the controller to communicate with and the actual model used on both ends of the communication.

## Spring Boot
Everything that is necessary to quickly start up the application.


### Requirements
- Java 17
- Maven 3.6.3

### Build Application
````bash
mvn clean compile
````

### Run Application
````bash
./mvnw spring-boot:run
````
Instead, you can also click on the run button in ProductDataAdapterApplication.java.


### Test Application
````bash
curl -i http://localhost:8090/health
````