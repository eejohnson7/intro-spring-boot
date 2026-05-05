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

    @Bean
    public Cheese americanCheese() {
        System.out.println("Creating bean: American Cheese");
        return new Cheese();
    }

    @Bean
    public Butter butter() {
        System.out.println("Creating bean: Butter");
        return new Butter();
    }    
}