public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

      
        System.out.println(arjun.name + " (" + arjun.role + "):");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println();

        System.out.println(bheem.name + " (" + bheem.role + "):");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println();

      
        System.out.println(duryodhan.name + " (" + duryodhan.role + "):");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.cruel();

        System.out.println();

        System.out.println(vikarn.name + " (" + vikarn.role + "):");
        vikarn.fight();
        vikarn.obey();
        vikarn.cruel();
        vikarn.kind();
    }
}
