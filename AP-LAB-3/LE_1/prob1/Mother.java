// Mother class with int x and show method
class Mother {
    int x = 10; // Initializing x with a value

    // Method to display value of x
    void show() {
        System.out.println("Value of x in Mother: " + x);
    }
}

// Child class that inherits from Mother
class Child extends Mother {
    // Empty body; Child inherits show() from Mother
}

public class Application {
    public static void main(String[] args) {
        // Creating an object of Mother
        Mother m = new Mother();
        m.show(); // show() of Mother is called

        // Creating an object of Child
        Child ch = new Child();
        ch.show(); // show() inherited from Mother is called
    }
}
