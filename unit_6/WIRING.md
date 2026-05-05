Advanced Bean Wiring in the Spring Framework

Handling Optional Dependencies with @Autowired
@Component
public class SandwichMaker {
    private final Bread bread;
    private final Cheese cheese;

    @Autowired(required = false)
    public SandwichMaker(Bread bread, Cheese cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    public void makeSandwich() {
        if (bread != null) {
            System.out.println("Using " + bread.getName());
        } else {
            System.out.println("No bread available");
        }
        
        if (cheese != null) {
            System.out.println("Using " + cheese.getName());
        } else {
            System.out.println("No cheese available");
        }
    }
}


Handling Optional Dependencies with Java Optional
@Component
public class SandwichMaker {
    private final Bread bread;
    private final Optional<Cheese> cheese;

    @Autowired
    public SandwichMaker(Bread bread, Optional<Cheese> cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    public void makeSandwich() {
        System.out.println("Using " + bread.getName());
        cheese.ifPresent(c -> System.out.println("Using " + c.getName()));
    }
}


Wiring By Bean Name (@Qualifier)
- particularly useful when you have several beans implementing the same inteface or extending the same class
@Component
public class SandwichMaker {
    private final Bread bread;
    private final Cheese cheese;

    @Autowired
    public SandwichMaker(Bread bread, @Qualifier("cheddarCheese") Cheese cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    public void makeSandwich() {
        System.out.println("Using " + bread.getName());
        System.out.println("Using " + cheese.getName());
    }
}


Injecting Collections of Beans
- useful when you need to handle or process multiple beans of the same type
@Component
public class SandwichMaker {
    private final Bread bread;
    private final List<Ingredient> ingredients;

    @Autowired
    public SandwichMaker(Bread bread, List<Ingredient> ingredients) {
        this.bread = bread;
        this.ingredients = ingredients;
    }

    public void makeSandwich() {
        System.out.println("Using " + bread.getName());
        ingredients.forEach(ingredient -> System.out.println("Using " + ingredient.getName()));
    }
}