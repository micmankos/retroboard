# retroboard
A basic retro board using Java springboot

# Build
Compile the code with 
```
# via mvn
mvn install

# via gradle
gradle build
```

# Run
I can run the jar with
```
# if build with maven
java -jar target/retroboard-0.0.1-SNAPSHOT.jar

# if built with gradle
java -jar build/libs/retroboard-0.0.1-SNAPSHOT.jar
```

# Notes
I used the [spring initializr](https://start.spring.io/) to create the initial project. Note that I was experiencing an error where the server stopped right after starting. I fixed by adding [this to my pom.xml](https://stackoverflow.com/a/38400929).

Curl the endpoint with `curl localhost:8080/hello`
