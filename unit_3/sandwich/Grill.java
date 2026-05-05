import org.springframework.stereotype.Component;

@Component
public class Grill {

    public Grill() {
        System.out.println("Creating bean: Grill");
    }

    public void turnOn() {
        System.out.println("Grill is turned on.");
    }

    public void turnOff() {
        System.out.println("Grill is turned off.");
    }
}