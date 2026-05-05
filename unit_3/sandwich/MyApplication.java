/*
 Welcome to the first task of this unit! In this task, you will explore how Spring Boot uses the @Bean and @Component annotations to manage beans within the application context. Your objective is to review the provided code and start the Spring Boot application by running the gradle bootRun command. After the server has started and the application is running, examine the console output to observe how beans are instantiated and managed. You should see messages similar to the following in the console:

Creating bean: Grill
Creating bean: Slice of Bread
Creating bean: Another Slice of Bread
Creating bean: American Cheese
Creating bean: Butter
Let's discuss the components and beans in more detail:

The Grill class is annotated with @Component, so Spring will automatically detect this class and create an instance of it as a bean.
The MyRecipe class is annotated with @Configuration, indicating that it can be used by the Spring IoC container as a source of bean definitions. Spring will scan this class for methods annotated with @Bean and create 4 beans. Note that there will be 2 beans of type Bread.
One of the Bread beans, defined by the method anotherSliceOfBread, has its bean name explicitly set to "anotherSliceOfBread".
Click the Run button to execute tests and the Submit button to proceed to the next task.
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
