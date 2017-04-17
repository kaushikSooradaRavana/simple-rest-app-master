# Simple REST Sample Application

A simple Spring Boot based sample application that exposes a single REST endpoint.

## Build the application

Build the project with Maven:

```
mvn clean package
```

## Run the application

Run the project locally:

```
mvn spring-boot:run
```

Access the application locally at: http://localhost:8180/simple-rest-app/v1/hello/MBUSA

Deploy the application to Cloud Foundry:

```
cf push
```

Access the application remotely at: https://simple-rest-app-v1.apps.dev.api.mbusa.oneweb.mercedes-benz.cinteo.de/simple-rest-app/v1/hello/MBUSA
