/*
In this task, you will practice using the @Component annotation to create beans in a Spring application. Your objective is to 
complete the Grill class by adding the missing @Component annotation. After making the necessary changes, start the application and 
observe the output to ensure that the bean is created correctly. Once ready, click the Run button to execute the tests and then press 
Submit to proceed to the next task.
*/

import org.springframework.stereotype.Component;

@Component
public class Grill {

    public Grill() {
        System.out.println("Instance of Grill is being created...");
    }
}
