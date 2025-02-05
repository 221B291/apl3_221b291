public class RubberDuck implements Swimmable, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck swims in the water.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}