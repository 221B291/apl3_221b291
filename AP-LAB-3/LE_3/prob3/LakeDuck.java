public class LakeDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake Duck swims in the water.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck flies in the sky.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}
