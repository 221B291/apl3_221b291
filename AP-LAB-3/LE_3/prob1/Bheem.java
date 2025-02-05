public class Bheem extends Pandav {
    Bheem() {
        name = "Bheem";
        role = "Pandav";
    }

    @Override
    void fight() {
        System.out.println("Bheem fights with immense strength.");
    }

    @Override
    void obey() {
        System.out.println("Bheem obeys his elders.");
    }

    void kind() {
        System.out.println("Bheem is less kind but obedient.");
    }
}
