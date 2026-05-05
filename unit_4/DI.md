Dependency Injection in Spring Boot

Dependency Injection at a Glance
Spring creates objects and manages their dependencies in various ways:
- Use the default constructor and instantiate properties via setters. -> Setter Dependency Injection
- Use a non-default constructor and pass all parameters into it. -> Constructor Dependency Injection
- Use the default constructor and Java reflection to instantitate private class fields. -> Field Dependency Injection
Spring uses the @Autowired annotation, which marks the points where dependencies should be injected.

Setter Dependency Injection
- involves creating an object through the default constructor and then setting its dependecies through setter methods annotated with @Autowired

@Component
public class Sandwich {

    private Bread bread;
    private Cheese cheese;

    public Sandwich() {
        // Default constructor
    }

    @Autowired
    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Autowired
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}


 Constructor Dependency Injection
 - involves passing all dependencies into the constructor to create an object

 @Component
public class Salad {

    private Lettuce lettuce;
    private Tomato tomato;

    // @Autowired is optional here (when only one constructor)
    public Salad(Lettuce lettuce, Tomato tomato) {
        this.lettuce = lettuce;
        this.tomato = tomato;
    }
}


Field Dependency Injection
- involves directly injecting dependencies into class fields even if they are private
- generally discouraged due to testability and encapsulation issues

@Component
public class Juice {

    @Autowired // (Spring uses reflection to inject required dependencies)
    private Water water;
    
    @Autowired
    private Sugar sugar;

    // Getters for water and sugar can be added if needed
}


Mixed Approach
- can be beneficial (more modular and testable)
- injecting mandatory dependencies through the constructor
- injectinbg optional dependencies through setters

@Component
public class Pizza {

    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;

    @Autowired
    public Pizza(Dough dough, Sauce sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    @Autowired
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}


Method Dependency Injection with @Bean
- involves injecting dependecies via method parameters in config classes
- clean and declaritive

@Configuration
public class AppConfig {

    @Bean
    public Sandwich sandwich(Bread bread, Cheese cheese) {
        return new Sandwich(bread, cheese);
    }

    @Bean
    public Bread bread() {
        return new Bread();
    }

    @Bean
    public Cheese cheese() {
        return new Cheese();
    }
}