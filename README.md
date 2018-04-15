# spring-cloud-config-server

[![Docker Automated buil](https://img.shields.io/docker/automated/bschalme/spring-cloud-config-server.svg?style=flat-square)](https://hub.docker.com/r/bschalme/spring-cloud-config-server/builds/)
[![Image Size](https://images.microbadger.com/badges/image/bschalme/spring-cloud-config-server.svg)](https://microbadger.com/images/bschalme/spring-cloud-config-server)

This is a Docker-ized version of [Spring Cloud Config Server](https://cloud.spring.io/spring-cloud-static/Edgware.SR3/multi/multi__spring_cloud_config_server.html).

Build the Spring Cloud Config Server as you would any other Gradle app:

```
./gradlew build
```

To build the Docker container:

```
docker build -t username/spring-cloud-config-server:latest .
docker push username/spring-cloud-config-server:latest
```

The preceding example tags and pushes the image to Docker Hub under `username`. If you are using a private registry, 
replace `username` with the FQDN of your Docker registry.

To run in Docker:

```
docker run -dp 8888:8888 username/spring-cloud-config-server
```
