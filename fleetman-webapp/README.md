# fleetman-webapp
A basic web front end for the FleetManager Microservice system.



## Execution Step


## steps to execute using Docker cmd
0. `Go to /01-Docker - Hands On for Java Developers/Resources+v3/Chapter 7 /fleetman-webapp   ` run

> mvn package 

1. Run command

> docker build  -t fleetman-webapp .

2. Get docker IP for **WINDOWS os**

> docker-machine ip

3. RUN Application using

> docker container run -it fleetman-webapp

4. Don't forget to port mapping using -p <hostport>:<DockerPort>

> docker container run -p 8080:8080 -it fleetman-webapp 

5. For testing, open http://localhost:8080/ in browser 

### Executing Using Eclipse UI

1. Add `-Dspring.profiles.active=development` to VM arguments while executing the `/fleetman-webapp/src/main/java/com/virtualpairprogrammers/FleetmanApplication.java`

2. Test by opening http://localhost:8080

### Executing Using CLI JAVA

1. go to target directory

2. Run following command

> java -Dspring.profiles.active=development -jar ./fleetman-0.0.1-SNAPSHOT


