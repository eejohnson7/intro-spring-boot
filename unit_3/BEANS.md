Creating and Managing Spring Beans

What is a Dependency?
Imagine your building a sandwich:
class Bread {}
class Lettuce {}
class Tomato {}
class Cheese {}
You need to make sure all dependencies are created before creating the sandwich. This can become cumbersome, especially in larger apps.

Spring Context and Beans to the Rescue
- Inversion of Control (IoC)
    - delegates the control of object creation and configuration from the class itself to an external framework
- Dependency Injection (DI)
    - specific form of IoC where dependencies are injected by the framework
- Spring Context
    - acts as an IoC container, managing objects known as beans
- Beans and bean management
    - these are auto created, configured, and managed by Spring
This eliminates the need for manual dependency management.

Understanding @Component Annotation
- acts as a signal to Spring saying "manage this class for me"
- Spring creates and manages an instance of that class as a bean
- discovery
    - when your Spring app starts, it scans for classes with label & auto creates an instance for each
- management
    - spring manages the lifecycle, configuration, and dependency injection of these objects
    - benefits: 
        - reduced manual work (no repeated code)
        - centralized management (spring tracks all labeled classes making it easier to manage dependencies and configurations)
        - dependency injection (spring auto injects objects where they are needed in your app)

How Spring Searches for Beans
- components scanning: auto discovery of beans annotated with @Component, @Service, etc.
- SpringBoot scans the base package where your bootstrap class is located and its subpackages to find annotated classes
- important note: components placed outside the base package and its subpackages wil be ignorecd

Using @Bean Annotation
- In addition to @Component you can explicitly define beans using @Bean inside a configuration class (@Configuration).
- This offers more fine grained control over bean creation.