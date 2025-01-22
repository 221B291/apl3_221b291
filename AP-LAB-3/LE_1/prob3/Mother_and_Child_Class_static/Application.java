class Mother {
    public static void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    public static void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();

        Mother motherObj = new Mother();
        motherObj.show();

        Child childObj = new Child();
        childObj.show();
    }
}
