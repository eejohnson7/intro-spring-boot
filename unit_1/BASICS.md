Spring Boot Basics

What is Spring?
Spring an open source framework created to simplify java development.

It offers a selection of libraries that address common challenges faced by devs & makes daily tasks easier:
- spring-core
    - fundamental parts of framework (inversion of control container)
- spring-web
    - logic for developing REST endpoints & handling web requests
- spring-security
    - authentication & authorization
- spring-data
    - simplifies data access across various data sources
- spring-mvc
    - features for building web apps
- spring-test
    - unit and integration tests

What is Spring Boot?
An extenstion of the Spring framework designed to simplify the development of new apps.
It streamlines the setup and dev process allowing devs to get started quickly with minimal configuration.

- auto configuration
    - automatically configures your app based on the dependencies you have added
- standalone apps
    - can run independently without the need for an external app server
- embedded servers (tomcat, etc.)
    - included so you don't have to deploy your app to an external server
- prod-ready features
    - provide built in support for metrics, health-checks, & externalized configuration
- opinionated defaults
    - offers sensable defaults to minimize boiler plate code and configuration
- spring boot starters
    - provide a set of preconfigured started dependency to simplify adding functionality to your project