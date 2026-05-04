Project Structure of a Spring App

spring-boot-intro/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── codesignal/
│   │   │           └── MyApplication.java
│   │   ├── resources/
│   │       └── application.properties
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── codesignal/
│   │   │           └── MyApplicationTests.java
├── build.gradle

src/main/java -> contains main source code (write java classes and define core logic of your app)
src/main/resources -> contains resources like config files, static files, and templates (resources in this directory are included in the class path)
src/test/java -> contains test cases, mirrors src/main/java structure but is used for testing purposes
These directories form the backbone ensuring it is organized and modular.

Important Files At a Glance:
- MyApplication.java: The main entry point of the Spring Boot application.
- build.gradle: The Gradle build file that manages dependencies and build configurations.
    - written using Groovy DSL, it defines dependencies, plugins, and tasks for building the application.
    - plugins -> enhances functionality
    - dependencies -> manages external libraries and their versions
    - repositories -> defines the locations to search for dependencies
    - group -> defines the group ID for the project
    - version -> defines the version of the project
    - sourceCompatibility -> defines the Java version compatibility
    - test -> defines the test framework and dependencies
- application.properties: Configuration file for the application.
- MyApplicationTests.java: Contains test cases for the application.

Expoloring the Bootstrap Class -> MyApplication.java
- This contains the main method that Spring Boot uses to launch the application.
- It is annotated with @SpringBootApplication, which enables auto-configuration and component scanning.
- The main method serves as the entry point and is executed when the JAR file is run.
- SpringApplication.run() -> tells Spring Boot to start the application, create the Spring application context, and start the embedded Tomcat server.

Most Useful Gradle Commands
- gradle build -> compiles and assembles the project
- gradle clean -> removes build artifacts (deletes the build directory)
- gradle test -> runs the test cases
- gradle bootRun -> runs the Spring Boot application
* execute these commands from the root directory of your project where the build.gradle file is located.*

Understanding Tomcat Server
- runs continuously
- receives HTTP requests
- embedded server
- default port: 8080
As a result when you execute the gradle bootRun command, the application runs until you tell it to stop.