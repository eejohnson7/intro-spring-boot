Bean Scopes and Lifecycles

Understanding Bean Scopes
In Spring, all beans are by default singletons. This singleton is re-used wherever the bean is injected. (efficient for stateless beans that can be used several times across the app w/o side effects)
- singleton -> one instance of the entire app
However, not all beans should be singletons. For stateful beans that shouldn't be shared, Spring offers different scopes
- prototype -> new instance each req
- session -> one instance per web session
- req -> one instance per HTTP req
You can declare different scopes using the @Scope alongisde @Component or @Bean

Declaring a Protype Bean with @Component
- this approach is particularly useful for stateful beans that should not share state with other instances

@Component
@Scope("prototype")
public class PrototypeComponentBean {
    public PrototypeComponentBean() {
        System.out.println("PrototypeComponentBean instance created.");
    }
}


Declaring a Protoype Bean with @Bean
- This method allows for more customization during bean creation
- Beneficial when you have more complex creation logic or config needs for your beans.

@Configuration
public class BeanConfig {

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}


Bean Lifecycle at a Glance
- bean creation -> birth
- DI -> growing up
- Initialization -> starting life (@PostCreation)
- Bean Usage -> living life
- Destruction -> end of life (@PreDestroy)

@Component
public class MyBean implements InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("Bean is being created (Constructor).");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean is being initialized (@PostConstruct).");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Bean is fully initialized (afterPropertiesSet from InitializingBean).");
    }

    public void performTask() {
        System.out.println("Bean is being used (performTask method).");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean is about to be destroyed (@PreDestroy).");
    }

    @Override
    public void destroy() {
        System.out.println("Bean is destroyed (destroy from DisposableBean).");
    }
}