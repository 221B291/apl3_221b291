class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother motherObj = new Mother();
        motherObj.show();

        Child childObj = new Child();
        childObj.show();
    }
}
