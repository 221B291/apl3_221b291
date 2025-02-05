public class RedHeadDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck swims in the water.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck flies in the sky.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}
