/*
Hello! In this task, you will practice using the @Bean annotation to create beans in a Spring application. 
Your objective is to complete the MyRecipe configuration class by adding the missing @Bean methods for Butter and Cheese. 
For the Cheese bean, use the name "americanCheese". After you implement the necessary changes, start the application and 
observe the output to ensure that the beans are created correctly. Once ready, click the Run button to execute the tests 
and then press Submit to proceed to the next task.
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRecipe {

    @Bean
    public Bread sliceOfBread() {
        System.out.println("Creating bean: Slice of Bread");
        return new Bread();
    }

    @Bean("anotherSliceOfBread")
    public Bread anotherSliceOfBread() {
        System.out.println("Creating bean: Another Slice of Bread");
        return new Bread();
    }

    // TODO: Add the @Bean definition for Cheese with the name "americanCheese"
    @Bean("americanCheese")
    public Cheese americanCheese() {
        System.out.println("Creating bean: American Cheese");
        return new Cheese();
    }

    // TODO: Add the @Bean definition for Butter 
    @Bean("butter")
    public Butter butter() {
        System.out.println("Creating bean: Butter");
        return new Butter();
    }
}