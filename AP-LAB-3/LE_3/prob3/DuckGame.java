public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        // Test Rubber Duck
        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();
        
        // Test Wooden Duck
        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        
        // Test RedHead Duck
        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        
        // Test Lake Duck
        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
