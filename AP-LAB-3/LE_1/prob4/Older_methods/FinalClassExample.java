class FinalVar {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("Value of x: " + x);
    }
}

class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
}



final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}

class FinalParameterExample {
    public void display(final int x) {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        FinalParameterExample obj = new FinalParameterExample();
        obj.display(10);
    }
}
